package annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(EmpConfigs.class);

		
		//Employee e  = (Employee)	context.getBean(Employee.class);	
	Employee e  = (Employee)	context.getBean("e2");
	System.out.println(e);
	
	Address a = (Address) context.getBean(Address.class);
	System.out.println(a);
		
	}

}
