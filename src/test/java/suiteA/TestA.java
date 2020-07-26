package suiteA;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testbase.TestBase;

  //@Listeners(listener.CustomListener.class)

public class TestA extends TestBase {
    
	//@Parameters("browser")
	@Test(groups= {"smoke","browserGroup2"},dataProviderClass = TestDataProvider.class, dataProvider = "getDataSuiteA")
	public void testA(String browserName, int roll, String lName) throws Exception {
		
		
		logInfo("Data set:--> "+browserName+" , "+roll+" , "+lName);
		//System.out.println("Browser:--> "+bra);

		if (!"Title1".equals("Title"))
			softAssert("Titles do not match.");

		logInfo("Logging into application");
		logInfo("Booking ticket");

		if (!"Text1".equals("Text"))
			softAssert("Text not matches");

		if (!"a".equals("b"))
			failAndStopTest("a is not valid");

		// Assert.fail("Some error message");// listener called , stop the test

		logInfo(browserName + " -- " + roll);
		Thread.sleep(2000);

		softAssert.assertAll();

		// errors will go in the end
		// using hard assert - soft assert errors are not reported

	}

}
