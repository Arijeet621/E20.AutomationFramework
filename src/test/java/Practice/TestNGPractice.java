package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {

	@Test(invocationCount = -1, priority = 1)
	public void createSample()
	{
		System.out.println("Create");
	}
	
	@Test(enabled = false)
	public void renameSample()
	{
		System.out.println("Rename");
	}
	
	@Test( invocationCount = 2,priority = 0)
	public void modifySample()
	{
		System.out.println("Modify");
	}
	
	@Test
	public void deleteSample()
	{
		Assert.fail();//Forcefully fail
		System.out.println("Delete");
	}
	
	@Test(dependsOnMethods = "deleteSample")
	public void restoreSample()
	{
		System.out.println("Restore");
	}
	
	
}
