package suiteC;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testbase.TestBase;

public class TestC extends TestBase {
	
	
    @Parameters("browser")
	@Test
	public void testC(String br) throws Exception {
        
    	logInfo("Browser--> :"+br);
		logInfo("Starting C");
		Thread.sleep(2000);
		logInfo("Ending C");
	}

}
