package springexamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context= new
				AnnotationConfigApplicationContext("bean.xml");
		
		Person p = (Person) context.getBean("p");
		System.out.println(p);

	}

}
