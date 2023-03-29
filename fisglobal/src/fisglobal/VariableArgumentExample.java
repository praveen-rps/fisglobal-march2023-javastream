package fisglobal;
class Test5{
	public void test(int...a) {
		for (int i:a) {
			System.out.println(i);
		}
	}
}

public class VariableArgumentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t = new Test5();
		t.test(10,20,30);

	}

}
