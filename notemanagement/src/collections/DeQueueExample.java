package collections;

import java.util.ArrayDeque;

public class DeQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque dq = new ArrayDeque();
		dq.add("India");
		dq.add("China");
		dq.add("Japan");
		System.out.println(dq);
		dq.addFirst("America");
		System.out.println(dq);
		dq.addLast("Singapore");
		System.out.println(dq);
		
		dq.removeFirstOccurrence("Japan");
		dq.removeLastOccurrence("Singapore");
		System.out.println(dq);

	}

}
