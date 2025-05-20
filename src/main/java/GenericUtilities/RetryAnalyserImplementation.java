package GenericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * This class provides implementation to IretryAnalyser Interface of TestNG
 * @author Arijeet
 */

public class RetryAnalyserImplementation implements IRetryAnalyzer
{
	int count = 0;
	int retryCount = 3;

	@Override
	public boolean retry(ITestResult result)
	{
		//0<3 1<3 2<3 3<3
		while(count<retryCount)
		{
			count++; //1 2 3
			return true; //retry retry retry
		}
		
		return false; //Stop retry
	}

}
