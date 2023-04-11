package javabased;

public class Employee {
	int id;
	String name;
	String dept;
	Address address;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int id, String name, String dept, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee() {
		
	}
	
	



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void calSalary() {
		System.out.println("Emp salary is calculated..");
	}
	
}
