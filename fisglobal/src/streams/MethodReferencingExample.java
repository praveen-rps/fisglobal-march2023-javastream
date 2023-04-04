package streams;
class Test{
	public void m1(){
			System.out.println("Hello this is referenced");
			System.out.println("This is second line");
			System.out.println("This is third line");
	}
}

public class MethodReferencingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Runnable r = Test::m1;
		Test t1 = new Test();
		Runnable r = t1::m1;
		Thread t = new Thread(r);
		t.start();

	}

}
