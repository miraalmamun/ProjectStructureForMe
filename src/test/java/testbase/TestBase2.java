package testbase;

import java.util.ArrayList;
import java.util.List;

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

public class TestBase2 {

	public ExtentReports reports;
	public ExtentTest test;
	public SoftAssert softAssert;
	public String browser;

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(ITestResult result, ITestContext con) {

		softAssert = new SoftAssert();

		reports = ExtentManager.getReports();
		test = reports.createTest(result.getMethod().getMethodName().toUpperCase());

		result.setAttribute("reports", test);

		String browser = null;

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < con.getAllTestMethods().length; i++) {

			String groupName[] = con.getAllTestMethods()[i].getGroups();

			for (String g : groupName) {

				if (g.startsWith("browser")) {
					browser = g;
					list.add(browser);
					break;
				}

			}

		}

		for (int i = 0; i < list.size(); i++) {

			browser = con.getCurrentXmlTest().getParameter(list.get(i));

			if (browser.equals("safari")) {
				
			} else if (browser.equals("mozila")) {
				
			} else {
				logInfo("Browser does not exist");
			}

		}

	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {

		reports.flush();
	}

	public void logInfo(String ms) {
		test.log(Status.INFO, ms);
		Reporter.log(ms, true);
	}

	public void logFailure(String ms) {
		test.log(Status.FAIL, ms);
		Reporter.log(ms, true);
	}

	public void logSkipped(String ms) {
		test.log(Status.SKIP, ms);
		Reporter.log(ms, true);
	}

	public void softAssert(String ms) {
		logFailure(ms);
		softAssert.fail(ms);
	}

	public void failAndStopTest(String ms) {
		softAssert(ms);
		softAssert.assertAll();
	}

}
