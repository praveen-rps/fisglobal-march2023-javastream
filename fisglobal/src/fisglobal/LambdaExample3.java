package fisglobal;

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside the child thread....");
		
	}
	
}
/*
 * interface Maths{
 * 	public int fact(int x);
 * }
 */

public class LambdaExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread m = new MyThread();
		
		Runnable r = ()->System.out.println("Inside the child thread of lambda");
		Thread t = new Thread(r);
		t.start();

	}

}
