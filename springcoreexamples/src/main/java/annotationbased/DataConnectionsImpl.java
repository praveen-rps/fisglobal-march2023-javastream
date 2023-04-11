package annotationbased;

import org.springframework.stereotype.Component;

@Component("mysql")
public class DataConnectionsImpl implements Dataconnections{

	public String getDriverName() {
		// TODO Auto-generated method stub
		return "general driver is loaded";
	}

	public String getDatabaseName() {
		// TODO Auto-generated method stub
		return "Mysql Database is used";
	}

}
