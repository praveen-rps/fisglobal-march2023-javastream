package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> ar = new ArrayList<>();
		//List<String> ar = new ArrayList<>();
		List<String> ar = new LinkedList<>();
		ar.add("India");
		ar.add("China");
		ar.add("japan");
		ar.add("Nepal");
		ar.add("China");
		
	//	List<String> ar1 = new ArrayList<>();
		List<String> ar1 = new LinkedList<>();
		ar1.add("Aust");
		ar1.add("Swedan");
		ar1.add("Denmark");
		ar.addAll(ar1);  // ar = ar+ ar1
		System.out.println("size "+ar.size());
		System.out.println(ar);
		// remove method is taking object as parameter
		ar.remove("Aust");
		System.out.println(ar);
		System.out.println("size "+ar.size());
		// object is removed based on index
		ar.remove(0);
		System.out.println(ar);
		System.out.println("size "+ar.size());
		Predicate<String> p = str -> str.charAt(0)=='C';
		
		// objects are removed based on a condition
		ar.removeIf(p);  // java8
		System.out.println(ar);
		System.out.println("size "+ar.size());
		//ar.removeAll(ar1);
		
		ar.retainAll(ar1);
		
		System.out.println(ar);
		System.out.println("size "+ar.size());
				
		ar1.clear();
		System.out.println(ar1);
	}

}



