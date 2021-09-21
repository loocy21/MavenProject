package dataDriven_Testing;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFrom_MySQL_Db_NonSelect {

	public static void main(String[] args) throws Throwable {
		//step1:register/load the mysql database;
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		
		//step2:get connect to database
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
		  
		  
		  //step3:create sql statement;
		Statement state= con.createStatement();
		String query="insert into students_info (regno, firstname, middlename, lastname) values('6', 'sony','res', 'kumar')";
		
		//step4:execute statement/query
		int result= state.executeUpdate(query);
		if(result==1) {
			System.out.println("user is created");
			
		}else {
			System.out.println("user is not created");
		}
		//step5:close the connection
		con.close();
	}

}
