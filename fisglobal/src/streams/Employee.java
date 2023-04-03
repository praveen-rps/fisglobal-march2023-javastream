package streams;

public class Employee {
	int empid;
	String name;
	String dept;
	int salary;
	public Employee() {
		
	}
	public Employee(int empid, String name, String dept, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
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
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
