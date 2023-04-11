package annotationbased;

import org.springframework.stereotype.Component;

@Component
public class DatabaseImpl implements Database{

	public String driver() {
		// TODO Auto-generated method stub
		return "general driver is loaded";
	}

}
