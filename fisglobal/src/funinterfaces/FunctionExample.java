package funinterfaces;

import java.util.function.Function;
class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}
public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f1 = x -> x*x*x;
		Function<Integer,Integer> f2 = x -> 2*x;
		Function<Integer,Integer> f3 = x -> {
					int fact=1;
					for(int i=2;i<=x;i++)
						fact= fact*i;
					return fact;
		};
		
		Function<Student,String> f4 = student->{
			String result = "fail";
			if(student.marks >= 70)
				result="Distinction";
			else if ( student.marks >=60 && student.marks <70)
				result ="first class";
			else if ( student.marks >=50 && student.marks <60)
				result ="second class";
			return result;
		};
		
		Student s1 = new Student("kumar",80);
		Student s2  = new Student("satish",65);
		Student s3  = new Student("anil",40);
		
		
		System.out.println("The cube of 2 is : "+f1.apply(2));
		System.out.println("The twice of 4 is : "+f2.apply(4));
		System.out.println("The factorial of 5 is : "+f3.apply(5));
		
		System.out.println("The result of kumar is : "+f4.apply(s1));
		System.out.println("The result of satish is : "+f4.apply(s2));
		System.out.println("The result of anil is : "+f4.apply(s3));
		
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}

}
