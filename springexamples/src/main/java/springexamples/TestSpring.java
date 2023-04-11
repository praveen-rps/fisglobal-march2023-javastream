package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
		
		
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);
		
		Address addr = (Address)context.getBean("adr");
		System.out.println(addr);
	
	}

}
