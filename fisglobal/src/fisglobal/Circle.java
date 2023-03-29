package fisglobal;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int radius;
		double area;
		System.out.println("Enter radius of circle");
		radius = sc.nextInt();
		area = 3.141 * radius * radius;
		System.out.println("The area of circle is : "+area);

	}

}
