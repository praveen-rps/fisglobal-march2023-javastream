package funinterfaces;

import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 0, c;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Inside the arithmetic catch block");
		}

		try {
			String str = "Hello";
			System.out.println(str.charAt(10));
			// System.out.println("The result of c : "+c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Inside the string index outof bounds");
		}

		System.out.println("After finally block...");

	}

}
