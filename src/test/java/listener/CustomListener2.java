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
public class CustomListener2 implements ITestListener {

	/**
	 * 
	 */

	@Override
	public void onTestStart(ITestResult result) {

		
		Reporter.log("Starting test ->" + result.getName(),true);
		
		ExtentTest test = (ExtentTest) result.getAttribute("reports");
		test.log(Status.INFO, "Starting test-->"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test success :->" + result.getName(),true);
		
		ExtentTest test = (ExtentTest) result.getAttribute("reports");
		test.log(Status.PASS, "Test success-->"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		Reporter.log("Test Failed :->" + result.getName(),true);
		Reporter.log("Failed Cause-->"+result.getThrowable().getMessage());
		
		ExtentTest test = (ExtentTest) result.getAttribute("reports");
		test.log(Status.FAIL, "Test Failed-->"+result.getName());
		test.log(Status.FAIL, "Failed Cause-->"+result.getThrowable().getMessage());
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		Reporter.log("Test Skipped: "+result.getName());
		
		ExtentTest test = (ExtentTest) result.getAttribute("reports");
		test.log(Status.SKIP, "Test skipped-->"+result.getName());
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
