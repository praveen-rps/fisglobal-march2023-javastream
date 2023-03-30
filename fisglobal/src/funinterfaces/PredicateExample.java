package funinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = x-> x%2==0;
		
		System.out.println(p1.test(10));// true
		System.out.println(p1.test(12)); //true
		System.out.println(p1.test(49)); // false
		
		Predicate<Integer> p2 = x->x>10;
		System.out.println(p2.test(10));// false
		System.out.println(p2.test(12)); //true
		System.out.println(p2.test(49)); // true
		System.out.println(p1.and(p2).test(24));
		System.out.println(p1.and(p2).test(4));
		
		System.out.println(p1.or(p2).test(4));
		System.out.println(p1.or(p2).test(3));
		
		System.out.println(p1.negate().test(4));
		
		
		

	}

}
