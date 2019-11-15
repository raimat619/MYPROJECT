package hello;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class hello_suit2 {

	
	@BeforeSuite
	void F()
	{

		System.out.println("F");
	}
	
	@Test(priority = 1)
	
	void D()
	{

		System.out.println("D");
	}
	
	@Test (priority = 0)
	void E()
	{

		System.out.println("E");
	}
	
	
}


