package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> ar = new ArrayList<>();
		List<String> ar = new LinkedList<>();
		ar.add("India");
		ar.add("China");
		ar.add("japan");
		ar.add("Nepal");
		ar.add("China");
		ListIterator ltr = ar.listIterator();
		
		System.out.println("Elements in forward directrion");
		while (ltr.hasNext())
			System.out.println(ltr.next());
		
		System.out.println("Elements in reverse directrion");
		while (ltr.hasPrevious())
			System.out.println(ltr.previous());


	}

}
