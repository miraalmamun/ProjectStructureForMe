package testbase;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class TestBase2 {

	@BeforeMethod
	public void beforeMethod(ITestResult result)
	{
		Reporter.log("----beforeMethod---- "+result.getMethod().getMethodName(),true);
		
		
		
	}
}
