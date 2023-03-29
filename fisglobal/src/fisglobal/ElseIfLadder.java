package fisglobal;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		age = sc.nextInt(); 
		if (age > 100 || age < 0)
			System.out.println("invalid age");
		else if ( age >=0 && age <= 17)
			System.out.println("Age not sufficient to vote");
		else
			System.out.println("you are eligible to vote;");
	}
}
