package seleniumrc;
import java.io.*;

import org.testng.annotations.Test;
public class BasicOperator

{
	@Test(priority = 0)
	void first ()
	{
		
		System.out.println("First");	
	}
	
	@Test(priority =3)
	void second ()
	{
		
		System.out.println("Second");	
	}
	
	@Test(priority = 2)

	void third ()
	{
		
		System.out.println("Third");	
	}
	
	
	public static void main(String []args)
	{
	int a = 2 , b = 5,sum ;
	System.out.println("Basic Operator Program");
	sum = a + b ;
	
	System.out.println("Sum is :" +sum);
	
	BasicOperator c = new BasicOperator();
	c.first();
	c.second();
	c.third();
	}

}
