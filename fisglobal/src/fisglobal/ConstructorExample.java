package fisglobal;
class Student{
	String name;
	String branch;
	Student(){
		System.out.println("Inside the default constructor");
		name="praveen";
		branch="cse";
	}
	Student(String name, String branch){
		System.out.println("Inside the parameterized constructor");
		this.name=name;
		this.branch=branch;
	}
	public void display() {
		System.out.println("name = "+name+" branch = "+branch);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student("kumar","civil");
		s1.display();
		System.out.println(s1);
		s2.display();
		System.out.println(s2);

	}

}
