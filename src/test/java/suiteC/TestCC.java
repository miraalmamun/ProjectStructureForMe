package suiteC;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testbase.TestBase;

public class TestCC extends TestBase {

	
	@Parameters("browser")
	@Test
	public void testCC(String sr) throws Exception {
	
		logInfo("Browser:--> "+sr);
		logInfo("Starting CC");
		Thread.sleep(2000);
		logInfo("Ending CC");
	}

}
