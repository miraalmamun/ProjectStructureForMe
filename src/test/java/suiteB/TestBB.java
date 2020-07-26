package suiteB;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testbase.TestBase;

//@Listeners(listener.CustomListener.class)
public class TestBB extends TestBase {
    
	@Parameters("browser")
	@Test(groups= {"sanity"})
	public void testBB(String bro) throws Exception {
        
		logInfo("Browser:--> "+bro);
		logInfo("some codes here ");
		Thread.sleep(2000);
		logInfo("some codes here ");
		logInfo("some codes here ");
		
	}

}
