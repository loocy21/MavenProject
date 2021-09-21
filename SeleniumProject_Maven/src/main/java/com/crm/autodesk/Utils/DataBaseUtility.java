package com.crm.autodesk.Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


import com.mysql.cj.jdbc.Driver;
/**
 * This Method Contains genric method from database
 * @author ANSHUL
 *
 */



public class DataBaseUtility {
	 Connection con = null;
	 Driver driverRef;
	 /**
	  * Connection with database is establised
	  * @throws Throwable
	  */
	 

	public void connectToDB() throws Throwable 
	{
		
	
		DriverManager.registerDriver(driverRef);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students\",\"root\",\"root");
	}
	/**
	 * DB connection is closed
	 * @throws Throwable
	 */
		public void closeDB() throws Throwable
		{
			con.close();
			
		}
		/**
		 * 
		 * @param query
		 * @param columnIndex
		 * @return
		 * @throws Throwable
		 */
		public String getDataFromDB(String query,int columnIndex ) throws Throwable {
			String value = null;
			ResultSet result =  con.createStatement().executeQuery(query);
			while(result.next())
			{
			result.getString(columnIndex);
			
			}
			return value;
		}
		
	}
