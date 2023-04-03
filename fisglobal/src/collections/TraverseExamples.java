package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TraverseExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	List<String> ar = new ArrayList<>();
		List<String> ar = new LinkedList<>();
		ar.add("India");
		ar.add("China");
		ar.add("japan");
		ar.add("Nepal");
		ar.add("China");

		System.out.println("Elements in the list without travesring");
		System.out.println(ar);
		
		// by using enhanced for loop
		System.out.println("elements by using enhcnaced for loop");
		for(String x: ar)  // java7
			System.out.println(x);

		Iterator itr = ar.iterator();  // java4
		System.out.println("elements by using iterator method");
		while (itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("elements by using forEach method");
		ar.forEach(System.out::println);  // java8
		
		
		

	}

}
