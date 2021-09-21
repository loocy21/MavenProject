package dataDriven_Testing;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class AccountStatus_UnitTest {
	@Test
	public void testAcccountType() throws SQLException {
		Connection con =null;
		try {
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		//get connect to database
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","root");
		 //create SQL statement 
		 Statement stat = con.createStatement();
		 String query="select * from account";
		 //execute statement query
		ResultSet result =stat.executeQuery(query);
		while(result.next()) {
			int accNum = result.getInt("accno");
			System.out.println(accNum);
			if(accNum ==123 && result.getString("accountType").equals("gold"));
			System.out.println("accunt type gold & varified == pass");
			
			break;
		}
	
	
	}catch(Exception e) {
		System.err.println("account type is not gold & not varified == fail");
	}finally {
		con.close();
		
		}
		

	
}
}