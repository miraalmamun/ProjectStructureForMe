/**
 * 
 */
package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

/**
 * @author Mr
 *
 */
public class CustomListener implements ITestListener {

	/**
	 * 
	 */

	@Override
	public void onTestStart(ITestResult result) {

		ExtentTest test = (ExtentTest) result.getAttribute("report");
		test.log(Status.INFO, "Starting test-> " + result.getName());
		Reporter.log("Starting test:->" + result.getName(),true);

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		ExtentTest test = (ExtentTest) result.getAttribute("report");
		test.log(Status.PASS, "Test Passed");
		Reporter.log("Test Passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		ExtentTest test = (ExtentTest) result.getAttribute("report");
		test.log(Status.FAIL, "Test Failed->" + result.getThrowable().getMessage());
		test.log(Status.FAIL, "Test Failed->" + result.getThrowable().getStackTrace());
		Reporter.log("Test Failed-> "+result.getThrowable().getMessage(),true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		
		ExtentTest test = (ExtentTest) result.getAttribute("report");
		test.log(Status.SKIP, "Test skipped---ListenerClass");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
