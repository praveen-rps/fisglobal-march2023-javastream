package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompatatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1004,"praveen","quality");
		Employee e2 = new Employee(1001,"kumar","finance");
		Employee e3 = new Employee(1002,"satish","production");
		Employee e4 = new Employee(1003,"mahesh","quality");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		Collections.sort(employees);
		
		
		System.out.println(employees);
	}

}
