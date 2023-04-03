package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamWithUserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1001,"praveen","quality",9000);
		Employee e2 = new Employee(1002,"kumar","finance",4500);
		Employee e3 = new Employee(1003,"satish","production",6000);
		Employee e4 = new Employee(1004,"mahesh","quality",8500);
		
		List<Employee> employees = new ArrayList<>();
		List<Employee> empdata = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		Predicate<Employee> p = emp -> emp.dept.equals("quality");
		empdata = employees.stream()
				 .filter(p)
				 .collect(Collectors.toList());
		
		Function<Employee,Employee> f = emp->
				new Employee(emp.getEmpid(), emp.getName(),emp.getDept(),emp.salary+500);
		
		List<Employee> result = empdata.stream().map(f).collect(Collectors.toList());
		System.out.println(result);
	

	}

}
