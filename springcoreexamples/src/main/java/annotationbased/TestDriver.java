package annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDriver {
	
	@Autowired
	Database data;
	
	public void showDriver() {
		System.out.println(data.driver());
	}

}
