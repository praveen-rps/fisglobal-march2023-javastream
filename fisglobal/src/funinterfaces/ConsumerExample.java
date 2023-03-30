package funinterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("kumar",80);
		Student s2  = new Student("satish",65);
		Student s3  = new Student("anil",40);
		
		Consumer<Student> c = s ->{
			System.out.println("The Name of Student: "+s.name);
			System.out.println("The Marks of Student: "+s.marks);
		};
		
		c.accept(s1);
		c.accept(s2);
		c.accept(s3);

	}

}
