package fisglobal;

interface Utilities{
	public boolean checkEven(int n);
}

class Utils implements Utilities{

	@Override
	public boolean checkEven(int n) {
		// TODO Auto-generated method stub
		if ( n%2!=0)
			return false;
		else
			return true;
	}
	
}

// n -> n%2==0;
//Utilities x = n -> n%2==0;
public class LambdaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utils u = new Utils();
		Utilities x = n -> n%2==0;
		System.out.println(u.checkEven(7));
		System.out.println(u.checkEven(10));
		System.out.println(x.checkEven(15));

	}

}
