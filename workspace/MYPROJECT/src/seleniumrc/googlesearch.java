package seleniumrc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//import java.awt.JobAttributes.DefaultSelectionType;

public class googlesearch
{
	
	
		
		public static void main(String[] args)  {
			
		    // System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omm\\Downloads\\chromedriver.exe");  
	          
	             // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  
		
		driver.get("http://www.gmail.com");
		
		 driver.findElement(By.id("identifierId")).sendKeys("raimattudu");
	        driver.findElement(By.className("CwaK9")).click();
	        Actions action = new Actions(driver);
	        action.
	        
		driver.close();
	        
	}

}
