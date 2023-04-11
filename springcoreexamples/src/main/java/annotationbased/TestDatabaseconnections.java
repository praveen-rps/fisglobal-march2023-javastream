package annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TestDatabaseconnections {
	
	@Autowired
	@Qualifier("orcl")
	Dataconnections data;
	
	public void display1() {
		System.out.println(data.getDatabaseName());
	}
	
	public void display2() {
		System.out.println(data.getDriverName());
	}

}
