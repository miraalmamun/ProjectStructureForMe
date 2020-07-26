package dataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider
	public static Object[][] getDataSuiteA(Method m, ITestContext con) {
		
		String browsers[] = con.getCurrentXmlTest().getParameter("browsers").split(",");
		Object[][] data = null;

		if (m.getName().toUpperCase().equals("TESTA")) {
			data = new Object[2][3];

			data[0][0] =browsers[0] ;
			data[0][1] = 1;
			data[0][2] = "Mamun-A";

			data[1][0] = browsers[1];
			data[1][1] = 2;
			data[1][2] = "Safwan-A";

		}
		else if (m.getName().toUpperCase().equals("TESTAA")) {
			data = new Object[2][3];

			data[0][0] = browsers[0];
			data[0][1] = 1;
			data[0][2] = "Mamun-1AA";

			data[1][0] = browsers[1];
			data[1][1] = 2;
			data[1][2] = "Safwan-1AA";

		}

		System.out.println("DataProvider--> "+m.getName());
		return data;
	}

	@DataProvider
	public static Object[][] getDataSuiteB(Method m) {
		
		Object[][] data = null;

		if (m.getName().toUpperCase().equals("TESTB")) {
			data = new Object[2][3];

			data[0][0] = "MirB";
			data[0][1] = 1;
			data[0][2] = "MamunB";

			data[1][0] = "MirSB";
			data[1][1] = 2;
			data[1][2] = "SafwanB";

		}
		else if (m.getName().toUpperCase().equals("TESTBB")) {
			data = new Object[2][3];

			data[0][0] = "Mir-1BB";
			data[0][1] = 1;
			data[0][2] = "Mamun-1BB";

			data[1][0] = "MirS-1BB";
			data[1][1] = 2;
			data[1][2] = "Safwan-1BB";

		}

		System.out.println("DataProvider--> "+m.getName());
		return data;
	}


}
