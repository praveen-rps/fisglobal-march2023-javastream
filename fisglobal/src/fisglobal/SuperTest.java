package fisglobal;

class A {
	int x;
	int y;
	A(int x, int y){
		this.x=x;
		this.y=y;
	}
	A(){
		x=1;
		y=2;
	}
	public void showA() {
		System.out.println("x = "+x+" y = "+y);
	}
	private void display() {
		System.out.println("Inside A class private method");
	}
}
// A a = new A(10,20);
class B extends A{
	int x;
	int y;
	B(int x, int y){
		super(10,30);
		this.x=x;
		this.y=y;
		
	}
	public void showB() {
		System.out.println("x = "+super.x+" y = "+y);
	}
	
	
	void display() {
		 System.out.println("Inside b class default method");
		}
	}


public class SuperTest extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(30,40);
		b.showB();
		b.display();

	}

}
