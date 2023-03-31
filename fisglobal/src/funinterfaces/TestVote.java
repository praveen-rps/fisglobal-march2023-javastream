package funinterfaces;
import java.util.Scanner;
public class TestVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		Voting vote = new Voting();
		try {
			vote.checkAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		catch(InsufficentAgeException e) {
			System.out.println(e);
		}

	}

}
