package seleniumrc;

import javax.activation.ActivationDataFlavor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ticket_booking
{
	
	
		
		public static void main(String[] args)  {
			
		    // System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omm\\Downloads\\chromedriver.exe");  
	          
	             // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	    WebElement ele = driver.findElement(By.name("userName"));
	    Actions action = new Actions(driver);
		action.moveToElement(ele).contextClick();
	    		//ele.sendKeys("hello");
	    		
	    		
		//driver.findElement(By.name("password")).sendKeys("Umesh@2019");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("jhjfdhd"));
		
		
		//driver.quit();
	}

}