package javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(EmpConfigs.class);

		
		//Employee e  = (Employee)	context.getBean(Employee.class);	
	Employee e1  = (Employee)	context.getBean("e2");
	System.out.println(e1.hashCode());
	
	Employee e2  = (Employee)	context.getBean("e2");
	System.out.println(e2.hashCode());
	
	Address a = (Address) context.getBean(Address.class);
	System.out.println(a);
	
	Book b = (Book) context.getBean(Book.class);
	System.out.println(b);
		
	}

}
