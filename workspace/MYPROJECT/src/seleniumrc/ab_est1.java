package seleniumrc;

import org.testng.annotations.Test;

 class  ab_est1 extends ab_test
{

	
	@Test
	void first()
	
	{
		System.out.print("first");
		
	}
	
	@Test
	void second()
	
	{
		System.out.print("second");
		
	}
	
	
	@Test
	void third()
	
	{
		System.out.print("third");
		
	}
	
	public static void main(String []args)
	{
		
		
		ab_est1 a = new ab_est1();
		a.first();
		a.second();
		a.third();
	}
			
			
}
