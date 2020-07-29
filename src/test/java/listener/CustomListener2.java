/**
 * 
 */
package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

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

		
		Reporter.log("Starting test listeners:->" + result.getName(),true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test success listeners:->" + result.getName(),true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		Reporter.log("Test Failed listeners:->" + result.getName(),true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("===Test skipped listeners===="+result.getName());
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
