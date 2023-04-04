package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ReadData {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			
						// 1. load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. establish the connection
			String url = "jdbc:mysql://localhost:3306/fisglobal";
			String uid="root";
			String  pwd="root";
			Connection con = DriverManager.getConnection(url,uid,pwd);
			con.setAutoCommit(false);
			
			// 3. create the statement object
			Statement st = con.createStatement();
			
			// 4. execute the query and fetch the results
		//	String qry ="select * from ssc";
			//String query="insert into ssc values(999,'harish','kolkata','westbengal')";
			//String query1 = "update ssc set name='hari' where htno=999";
			//String query2 = "update ssc set name='hari' where htno=999";
			String query = "create table global1(id int,name varchar(20),city varchar(20))";
			
			//ResultSet rs = st.executeQuery(qry);	
			//int k1= st.executeUpdate(query1);
		//	int k2= st.executeUpdate(query2);
			
			st.execute(query);
			System.out.println("table created...");
			
			// 5. display the fetech content
			//while(rs.next())
				//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		
			// 6. close the object
			//rs.close();
			st.close();
			con.close();
			
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			//con.commit();
		}

	}

}
