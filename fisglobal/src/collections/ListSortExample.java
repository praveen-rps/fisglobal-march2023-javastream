package collections;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> data = new ArrayList<>();
		data.add(10);
		data.add(2);
		data.add(8);
		data.add(5);
		System.out.println(data);
		
		Collections.sort(null, null);
		System.out.println(data);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("sunil");
		names.add("mahesh");
		names.add("anil");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		Employee e1 = new Employee(1001,"praveen","quality");
		Employee e2 = new Employee(1002,"kumar","finance");
		Employee e3 = new Employee(1003,"satish","production");
		Employee e4 = new Employee(1004,"mahesh","quality");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		

	}

}
