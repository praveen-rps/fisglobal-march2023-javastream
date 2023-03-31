package funinterfaces;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=2;
		
		try
		{
			if(a < b)
				throw new ArrayIndexOutOfBoundsException();
			else
				throw new ArithmeticException();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside array index exception block");
		}
		catch(ArithmeticException e) {
			System.out.println("Inside arithmetic exception block");
		}
		}

	}


