package dataDriven_Testing;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;




public class ReadDataFromMy_SQl_DB {
	public static void main(String[] args) throws Throwable {
		//register the mysql database;
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		//get connect to database
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
		 //create SQL statement 
		 Statement stat = con.createStatement();
		 String query="select * from students_info";
		 //execute statement query
		ResultSet result =stat.executeQuery(query);
		
		while(result.next()) {
			System.out.println(result.getInt(1) + "\t"+result.getString(2) + "\t"+result.getString(3) + "\t"+result.getString(4));
		}
		//close the connection
		con.close();
		
	
	
	
	}

}
