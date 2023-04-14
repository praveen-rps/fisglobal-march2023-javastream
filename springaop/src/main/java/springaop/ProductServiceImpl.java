package springaop;

public class ProductServiceImpl implements ProductService {

	
	public ProductServiceImpl() {
		
	}
	
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	public void test1(int a, int b, int c) {
		System.out.println("inside 3 args");
	}
	public void test2(int a, int b) {
		System.out.println("inside 2 args");
	}

	public void display() {
		System.out.println("Inside the display method..");
	}
	/*
	@Override
	public void display(int a) {
		// TODO Auto-generated method stub
		System.out.println("Inside the display method...");
		System.out.println("The value of a :" +a);
		
	}
*/
	
}
