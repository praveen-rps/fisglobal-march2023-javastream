package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class StudentIdComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -(o1.id-o2.id);
	}
	
}

class StudentNameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class StudentDeptComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getBranch().compareTo(o2.getBranch());
	}
	
}

public class TestStudentSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1001,"kiran","cse");
		Student s2 = new Student(1009,"anil","mech");
		Student s3 = new Student(1005,"niran","eee");
		Student s4 = new Student(1008,"mahesh","biotech");
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		System.out.println("Students sorted on id");
		Collections.sort(students,new StudentIdComparator());
		students.forEach(System.out::println);
		
		
		System.out.println("Students sorted on Name");
		Collections.sort(students,new StudentNameComparator());
		students.forEach(System.out::println);
		
		
		System.out.println("Students sorted on Dept");
		Collections.sort(students,new StudentDeptComparator());
		students.forEach(System.out::println);
		

	}

}
