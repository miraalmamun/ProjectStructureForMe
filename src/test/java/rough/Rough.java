package rough;

import java.util.ArrayList;
import java.util.List;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Rough {

	
	List<String> list = new ArrayList<String>();
	
	
	@Test
	public void rough(ITestContext con)
	{  
		 
		
		System.out.println(con.getAllTestMethods()[0].getGroups());
	}
	
	

}
