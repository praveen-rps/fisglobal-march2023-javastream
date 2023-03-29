package fisglobal;


class Test4{
	Test4(){
		System.out.println("Inside default constructor");
	}
	Test4(int x){
		System.out.println("Inside single parameter constructor");
	}
	Test4(int y, int z){
		System.out.println("Inside double parameter constructor");
	}
	Test4(int y, int z, int a){
		System.out.println("Inside triple parameter constructor");
	}
	public void display() {
		System.out.println("Inside zero parameter display");
	}
	public void display(int x) {
		System.out.println("Inside one parameter display");
	}
	public void display(int x, int y) {
		System.out.println("Inside two parameter display");
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test4 t1= new Test4();
		Test4 t2 = new Test4(10);
		Test4 t3 = new Test4(10,20);
		t1.display();
		t1.display(10);
		t1.display(20,20);
	}

}
