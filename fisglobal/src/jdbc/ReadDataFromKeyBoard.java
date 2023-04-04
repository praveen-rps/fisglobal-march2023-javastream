package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ReadDataFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			Scanner sc = new Scanner(System.in);
			// 1. load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. establish the connection
			String url = "jdbc:mysql://localhost:3306/fisglobal";
			String uid="root";
			String  pwd="root";
			Connection con = DriverManager.getConnection(url,uid,pwd);
			con.setAutoCommit(false);
			
			// 3. create the prepared statement object
			String query = "insert into ssc values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			System.out.println("Enter htno");
			int htno = sc.nextInt();
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter city");
			String city = sc.next();
			System.out.println("Enter State");
			String state = sc.next();
			pst.setInt(1, htno);
			pst.setString(2, name);
			pst.setString(3,city);
			pst.setString(4, state);
			pst.executeUpdate();
			System.out.println("Record inserted...");
			con.commit();
			pst.close();
			con.close();
			
			
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			
		}


	}

}
