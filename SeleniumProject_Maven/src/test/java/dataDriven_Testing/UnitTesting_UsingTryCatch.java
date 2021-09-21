package dataDriven_Testing;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UnitTesting_UsingTryCatch {

	public static void main(String[] args) throws Throwable {
		Connection con = null;
		try {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		
		//step2:get connect to database
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
		  
		  
		  //step3:create sql statement;
		Statement state= con.createStatement();
		String query="insert into students_info (regno, firstname, middlename, lastname) values('7', 'sony','res', 'kumar')";
		
		//step4:execute statement/query
		int result= state.executeUpdate(query);
		if(result==1) {
			System.out.println("user is created");
		}
		}
		catch(Exception e) {
			System.err.println("user is not created==Fail");
		}
		finally {
			con.close();
		}
		
	
	}
}
