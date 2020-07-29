package suiteA;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testbase.TestBase2;

@Listeners(listener.CustomListener2.class)
public class TestA2 extends TestBase2 {

	@Test()
	public void testA2_1() {

		Reporter.log("----testA2_1 in method----", true);
	}

	@Test()
	public void testA2_2() {

		Reporter.log("----testA2_2 in method----", true);
	}

	@Test()
	public void testA2_3() {

		Reporter.log("----testA2_3 in method----", true);
	}

	@Test()
	public void testA2_4() {

		Reporter.log("----testA2_4 in method----", true);
	}

	@Test()
	public void testA2_5() {

		Reporter.log("----testA2_5 in method----", true);
	}

	@Test()
	public void testA2_6() {

		Reporter.log("----testA2_6 in method----", true);
	}

}
