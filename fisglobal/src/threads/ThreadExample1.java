package threads;

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("start of the child thread");
		for(int i=1;i<=100;i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("End of child thread");
	}
	
}
public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		t.start();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println("start of main thread");
		for(int i=101;i<=200;i++)
			System.out.println(i);
		System.out.println("end of main thread");
	}

}
