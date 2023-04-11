package springexamples;

import org.springframework.stereotype.Component;

@Component("p")
public class Person {
	
	int id;
	String name;
	public Person() {
		id=1001;
		name="kumar";
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
