package fisglobal;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++)
			System.out.println("Hello inside for loop");

		int[] x = { 1, 2, 3, 4, 6 };
		for (int y : x) {  // enhanced for loop
			System.out.println("Inside loop");
		}

	}

}
