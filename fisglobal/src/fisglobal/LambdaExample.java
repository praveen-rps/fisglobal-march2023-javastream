package fisglobal;


@FunctionalInterface
interface Maths{
	//public int add(int a, int b);
	public double area(int radius);

}

class Mathematic implements Maths{
	//public int add(int a, int b){
		//return a+b;
	//}
	
	public double area(int radius) {
		return 3.141*radius*radius;
	}
}


// (a,b)->a+b;

// radius -> 3.141*radius*radius;
public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mathematic m1 = new Mathematic();
		System.out.println(m1.area(5));
		
		Maths m = radius -> 3.141*radius*radius;
		
		//Maths m2 = (a,b)->a+b;
		//System.out.println(m.add(10,20));
		System.out.println("The area of circle with 5 radius "+m.area(5));

	}

}
