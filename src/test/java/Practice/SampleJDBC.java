package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBC {

	@Test
	public void executeQueryJDBC() throws SQLException
	{
		//Fetch the database
		Driver dRef = new Driver();
		
		//Step 1: Register the driver/database
		DriverManager.registerDriver(dRef);
		
		//Step 2: Get connection with driver - Database name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Arijeet@1999");
		
		//Step 3: Issue create statement
		Statement state = con.createStatement();
		
		//Step 4: Execute any query - table name
		ResultSet result = state.executeQuery("select * from studentdb;");
		
		while(result.next())
		{
			System.out.println(result.getString(1)+"-"+result.getInt(2)+"-"+result.getString(3));
		}
		
		//Step 5: Close the DB
		con.close();
		
	}
	
	
	@Test
	public void executeUpdateJdBC() throws SQLException
	{
		//Fetch the database
		Driver dRef = new Driver();
		
		//Step 1: Register the driver/database
		DriverManager.registerDriver(dRef);
		
		//Step 2: Get connection with driver - Database name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Arijeet@1999");
		
		//Step 3: Issue create statement
		Statement state = con.createStatement();
		
		//Step 4: Execute any query - table name
		int result = state.executeUpdate("insert into studentdb values('Madhu',24,'Layekbazar')");
		
		if(result==1)
		{
			System.out.println("Data added");
		}
		
		//Step 5: Close the DB
		con.close();
		
	}
}
