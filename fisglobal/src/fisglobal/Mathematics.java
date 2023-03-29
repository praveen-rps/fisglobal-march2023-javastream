package fisglobal;
import java.util.Scanner;
public class Mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber,secondNumber,result;
		System.out.println("enter first number");
		Scanner sc = new Scanner(System.in);
		firstNumber = sc.nextInt();
		System.out.println("enter second number");
		secondNumber = sc.nextInt();
		result = firstNumber + secondNumber;
		System.out.println("The sum is : "+result);

	}

}
