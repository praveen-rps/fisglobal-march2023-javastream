package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
		
		
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1.hashCode());
		e1.calSalary();
		
		Employee e2 = (Employee) context.getBean("emp");
		System.out.println(e2.hashCode());
		
		Address addr = (Address)context.getBean("addr");
		System.out.println(addr);
	
	}

}
