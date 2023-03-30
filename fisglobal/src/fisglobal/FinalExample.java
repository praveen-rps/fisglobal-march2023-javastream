package fisglobal;

/*
 * If final keyword is applied on a variable, then it becomes constant,
 * ie value cannot be changed.
 * 
 * If it is applied on a method, then it cannot be overriden
 * 
 * If it is applied on a class, then it cannot be inherited
 */
class Parent{
	int x=10;
	public void show() {
		x++;
		System.out.println("Inside the show method of parent");
	}
}

class Child extends Parent{
	int y;
	@Override
	public void show() {
		System.out.println("Inside the show method of child");
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
