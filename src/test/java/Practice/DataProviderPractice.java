package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

	@Test(dataProvider = "getData")
	public void createEmployeeDetails(String name, int id)
	{
		System.out.println("Name is - "+name+" and Id is - "+id);
		System.out.println("------------------------------------------");
	}
	
	//Create Customer - Create emp data - DataProvider
	
	@DataProvider
	public Object[][] getData()
	{
		//3 row - 3 data set and each has 2 columns - 2 information
		Object[][] data = new Object[3][2];
		
		//1st Data set
		data[0][0] = "Arijeet";
		data[0][1] = 12;
		
		//2nd Data set
		data[1][0] = "Ram";
		data[1][1] = 34;
		
		//3rd Data set
		data[2][0] = "Sam";
		data[2][1] = 23;
		
		return data;
	}
	
}
