package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListUserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1001,"praveen","quality");
		Employee e2 = new Employee(1002,"kumar","finance");
		Employee e3 = new Employee(1003,"satish","production");
		Employee e4 = new Employee(1004,"mahesh","quality");
		
		List<Employee> employees = new ArrayList<>();
		List<Integer> ints = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		System.out.println(ints);
		
		System.out.println(employees);
		
		Predicate<Employee> p = emp->emp.getDept().equals("quality");
		employees.removeIf(p);
		System.out.println(employees);
		
		employees.forEach(System.out::println);
		employees.remove(0);
		for(Employee e:employees)
			System.out.println(e);
		

	}

}
