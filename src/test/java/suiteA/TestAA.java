package suiteA;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testbase.TestBase;

public class TestAA extends TestBase {

	@Test(groups= {"smoke","browserGroup1","sanity","regression"},dataProviderClass = TestDataProvider.class, dataProvider = "getDataSuiteA")
	public void testAA(String browserName, int roll, String lname) throws Exception {

		logInfo("Starting AA---> " + browserName);
		logInfo(browserName + " " + " " + roll + " " + lname);
		Thread.sleep(2000);
		//logInfo("Browser Name:--> "+ browser);
		logInfo("Ending AA " + roll);
	}

}
