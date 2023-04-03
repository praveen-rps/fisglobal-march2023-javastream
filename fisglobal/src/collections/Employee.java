package collections;

public class Employee implements Comparable<Employee>{
	int empid;
	String name;
	String dept;
	public Employee() {
		
	}
	public Employee(int empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (o.empid-this.empid);
	}

}
