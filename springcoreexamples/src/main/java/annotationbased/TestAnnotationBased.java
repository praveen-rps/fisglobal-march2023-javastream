package annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javabased.EmpConfigs;

public class TestAnnotationBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(TestConfigs.class);
		
		Book b= (Book)context.getBean(Book.class);
		System.out.println(b);
	
		
		TestDatabaseconnections t = 
				(TestDatabaseconnections)context.getBean(TestDatabaseconnections.class);
		
		t.display1();
		t.display2();

	}

}
