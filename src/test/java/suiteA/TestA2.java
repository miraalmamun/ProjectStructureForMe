package suiteA;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.TestDataProvider2;
import testbase.TestBase2;

//@Listeners(listener.CustomListener2.class)

//@Test(groups = {"TestA2"})
public class TestA2 extends TestBase2 {

	@Test(groups = {"smoke","sanity","browserGroup1"})
	public void testA2_1() {

		String expected = "Mir";
		if (!expected.equals("Mir2")) {
			softAssert("Title does not match");
		} else {
			logInfo("Title matches");
		}
		logInfo("one line of code here");
		logInfo("one line of code here");
		logInfo("one line of code here");
		logInfo("one line of code here");
		if (!expected.equals("Mir")) {
			softAssert("Expected value and Actual value does not same");
		} else {
			logInfo("Expected value and Actual value same");
		}

		softAssert.assertAll();
	}

	@Test(groups = {"smoke","browserGroup2"})
	public void testA2_2() {
		String expected = "Mir";

		logInfo("one line of code here");
		logInfo("one line of code here");
		logInfo("one line of code here");
		logInfo("one line of code here");

		if (!expected.equals("Mir2")) {
			failAndStopTest("This is a critical error");
		} else {
			logInfo("Both value same");
		}

		logInfo("one line of code here");
		logInfo("one line of code here");
		logInfo("one line of code here");

	}

	@Test(groups = {"sanity","browserGroup1"})
	public void testA2_3() {

		logInfo("----testA2_3 in method----");
	}

	@Test(groups = {"sanity","browserGroup1"})
	public void testA2_4() {

		logInfo("----testA2_4 in method----");
	}
	
	
	

	@Test(groups = {"smoke","sanity","browserGroup2"},dataProviderClass = TestDataProvider2.class,dataProvider = "TestA2")
	public void testA2_5(String browser, int number) {

		logInfo("Browser: "+browser+" / number: "+ number);
	}

	
	
	
	
	@Test(groups = {"smoke","browserGroup1"})
	public void testA2_6() {

		logInfo("----testA2_6 in method----");
		Assert.fail("Forced to fail");

	}

}
