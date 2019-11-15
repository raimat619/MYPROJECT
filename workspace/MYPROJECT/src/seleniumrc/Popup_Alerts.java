package seleniumrc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Popup_Alerts

{
	public static void main(String []args) throws InterruptedException

	{
		// System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\omm\\Downloads\\chromedriver.exe");  
	      
	         // Instantiate a ChromeDriver class.     
	   WebDriver driver = new ChromeDriver();
	   
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.name("proceed")).click();
	    Alert alert = driver.switchTo().alert();
	   String str = driver.switchTo().alert().getText();
	    Thread.sleep(5000);
	    alert.accept();
	   
	     driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("hello");
	     driver.findElement(By.xpath("//*[contains(@id,'password')]")).sendKeys("hello");
	  System.out.println("Title is :" +str);
	  Assert.assertEquals("Please enter a valid user name", str);
	  
	  System.out.println("Acual and expected are equal :" +str);
	    
	    driver.quit();
	}


}
