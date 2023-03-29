package fisglobal;
class Employee{
	int id;
	String name;
	static String company;
	static public void registration() {
		System.out.println("company = "+company);
		System.out.println("inside the registration static class");
	}
	public void showDetails() {
		System.out.println("id = "+id+" name = "+name+" Company ="+company);
	}
	
	static {
		System.out.println("Inside the static block...");
	}
	
	{
		System.out.println("inside the non static block..");
	}
}

public class StaticExample {
// StaticExample s = new StaticExample();
	//s.main();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee emp1 = new Employee();
		emp1.id=1001;
		emp1.name="praveen";
		emp1.company="RPS";
		emp1.showDetails();
		Employee emp2 = new Employee();
		emp2.id=1002;
		emp2.name="kumar";
		emp2.company="FIS Global";
		emp1.showDetails();
		*/
		Employee.company="RPS";
		Employee emp1 = new Employee();
		emp1.showDetails();
		
		Employee.registration();
		
		Employee emp2 = new Employee();	

	}

}
