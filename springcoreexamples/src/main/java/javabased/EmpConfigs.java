package javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(BooksConfig.class)
public class EmpConfigs {
	
	
	@Bean("e1")
	public Employee createEmployee1() {
		return new Employee(1001,"praveen","quality", createAddress());
	}
	
	@Bean("e2")
	@Scope("prototype")
	public Employee createEmployee2() {
		return new Employee(1002,"kumar","testing", createAddress());
	}
	
	@Bean
	public Address createAddress() {
		return new Address(111,"Koramangala","Bangalore");
	}

}
