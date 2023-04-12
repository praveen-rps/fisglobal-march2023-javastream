package springjdbcdemo.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springjdbcdemo.model.SalesTable;
import springjdbcdemo.service.SalesService;

public class SalesController {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new
				ClassPathXmlApplicationContext("beans.xml");
		
		SalesService service= (SalesService)context.getBean("iservice");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp name");
		String ename = sc.next();
	/*	System.out.println("Enter job");
		String job = sc.next();
		System.out.println("Enter emp sal");
		int sal = sc.nextInt();
		SalesTable data = new SalesTable(ename,job,sal);
		*/
		//service.addData(data);
		service.deleteData(ename);
		//System.out.println("data inserted....");
		System.out.println("data deleted....");
		
		
	}

}
