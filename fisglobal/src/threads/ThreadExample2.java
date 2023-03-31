package threads;

/*
class RThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside the child thread...");
		
	}
	
}
*/
public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RThread r = new RThread();
		Runnable r = ()-> System.out.println("Inside the child thread...");
		Thread t = new Thread(r);
		t.start();
		

	}

}
