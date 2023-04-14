package sourcecode;

public class Maths {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int biggest(int a, int b , int c) {
		int big=a;
		if( a < b)
			if( b < c)
				big=c;
			else
				big=b;
		else
			if ( a < c)
				big=c;
			else
				big=a;
		return big;
	}

}
