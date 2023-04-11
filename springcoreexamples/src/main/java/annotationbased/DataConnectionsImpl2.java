package annotationbased;

import org.springframework.stereotype.Component;

@Component("orcl")
public class DataConnectionsImpl2 implements Dataconnections {

	public String getDriverName() {
		// TODO Auto-generated method stub
		return "type4 driver is loaded";
	}

	public String getDatabaseName() {
		// TODO Auto-generated method stub
		return "Oracle database is used";
	}

}
