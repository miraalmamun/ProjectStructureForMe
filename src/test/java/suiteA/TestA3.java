package suiteA;

import org.testng.annotations.Test;


import testbase.TestBase2;

//@Test(groups = {"TestA3"})
public class TestA3 extends TestBase2 {

	@Test(groups = {"smoke","sanity","browserGroup2"})
	public void testA3_1() {
		System.out.println("test7");
	}

	@Test(groups = {"smoke","sanity","browserGroup1"})
	public void testA3_2() {
		System.out.println("test8");
	}

	@Test(groups = {"smoke","sanity","browserGroup1"})
	public void testA3_3() {
		System.out.println("test9");
	}

	@Test(groups = {"smoke","sanity","browserGroup1"})
	public void testA3_4() {
		System.out.println("test10");
	}

	@Test(groups = {"smoke","sanity","browserGroup1"})
	public void testA3_5() {
		System.out.println("test11");
	}

	@Test(groups = {"smoke","sanity","browserGroup1"})
	public void testA3_6() {
		System.out.println("test12");
	}

}
