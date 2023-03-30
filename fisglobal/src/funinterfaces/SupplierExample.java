package funinterfaces;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> s = ()-> Math.random()*10;
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		

	}

}
