package fisglobal;

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second, third;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		first = sc.nextInt();
		System.out.println("Enter first value");
		second = sc.nextInt();
		System.out.println("Enter first value");
		third = sc.nextInt();
		
		if ( first < second) {
			if(second < third)
				System.out.println(third+" is bigger");
			else
				System.out.println(second+" is bigger");
		}
		else {
			if (first < third)
				System.out.println(third +" is bigger");
			else
				System.out.println(first +"is bigger");
		}
		
		

	}

}
