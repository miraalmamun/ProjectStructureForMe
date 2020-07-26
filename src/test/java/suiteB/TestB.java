package suiteB;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testbase.TestBase;

public class TestB extends TestBase {

	@Test(dataProviderClass =TestDataProvider.class,dataProvider = "getDataSuiteB")
	public void testB(String name, int roll, String lname) throws Exception {

		logInfo("Starting B");
		logInfo(name + " " + " " + roll + " " + lname);
		Thread.sleep(2000);
		logInfo("Ending B");
	}
}
