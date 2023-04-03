package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<>();
		hs.add("India");
		hs.add("China");
		hs.add("Japan");
		hs.add("Nepal");
		hs.add("Japan");
		System.out.println(hs);
		
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("India");
		lhs.add("China");
		lhs.add("Japan");
		lhs.add("Nepal");
		lhs.add("Japan");
		System.out.println(lhs);
		
		Set<String> ts = new TreeSet<>();
		ts.add("India");
		ts.add("China");
		ts.add("Japan");
		ts.add("Nepal");
		ts.add("Japan");
		System.out.println(ts);
		
		Employee e1 = new Employee(1001,"praveen","quality");
		Employee e2 = new Employee(1002,"kumar","finance");
		Employee e3 = new Employee(1003,"satish","production");
		Employee e4 = new Employee(1004,"mahesh","quality");
		
		Set<Employee> s = new TreeSet<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		System.out.println(s);
		
		s.removeIf(str->str.empid>1002);
		s.forEach(System.out::println);
		
	}

}
