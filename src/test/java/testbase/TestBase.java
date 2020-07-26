package testbase;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class TestBase {

	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert softAssert;
	public String browserGrp;

	@BeforeMethod(alwaysRun = true)
	public void init(ITestResult result, ITestContext con) {
		softAssert = new SoftAssert();
		rep = ExtentManager.getReports();
		test = rep.createTest(result.getMethod().getMethodName().toUpperCase());
		result.setAttribute("report", test);
		// browser = con.getCurrentXmlTest().getParameter("browser");
		// logInfo("Browser:--> "+ browser);

		String groupName[] = con.getAllTestMethods()[0].getGroups();
		String browserGroup = "";
		for (String g : groupName) {
			//System.out.println(g);
			if (g.startsWith("browserGroup")) {
				browserGroup = g;
				break;
			}
		}

		browserGrp = con.getCurrentXmlTest().getParameter(browserGroup);
		System.out.println("BrowserGrp is "+ browserGrp);
	}

	@AfterMethod(alwaysRun = true)
	public void quit() {
		rep.flush();
	}

	public void logInfo(String msg) {

		test.log(Status.INFO, msg);
		Reporter.log(msg, true);

	}

	public void logFailure(String msg) {// only fails in extent reports
		test.log(Status.FAIL, msg);
		Reporter.log(msg, true);
	}

	public void logSkipped(String msg) {
		test.log(Status.SKIP, msg);
		Reporter.log(msg, true);
	}

	public void failAndStopTest(String msg) {// fail in testng as well as extent - but stop
		softAssert(msg);
		// takeScreenShot();
		softAssert.assertAll();// stop
	}

	public void softAssert(String msg) {// fail in testng as well as extent - but continue
		logFailure(msg);// extent
		softAssert.fail(msg); // testng
		// take screenshot as well - put in reports
	}

}
