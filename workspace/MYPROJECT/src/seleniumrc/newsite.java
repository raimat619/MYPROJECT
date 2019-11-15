package seleniumrc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class newsite 

{

	public static void main(String []args)
	
	{
		
		System.out.println("New Site to test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omm\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		//driver.getTitle();
		
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.className("mainheading"));
		element.isDisplayed();
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		driver.manage().window().maximize();
		driver.findElement(By.className("mainheading"));
		WebElement ele = driver.findElement(By.id("radiobutton"));
		ele.click();
		
		if (ele.isSelected())
		{
			
			System.out.println("Check box is  selected");
		}
		else 
		{
			System.out.println("Check box is not selected");
		}
		
		driver.findElement(By.xpath("//option[@value='Selenium Code']")).click();
		driver.findElement(By.xpath("//input[@name='selected(1234)']")).click();
	
      // WebElement elf =  driver.findElement(By.xpath("//a[@href'Home Page']"));
       driver.findElement(By.id("verifybutton"));
      WebElement ele3= driver.findElement(By.id("html5div"));
      ele3.sendKeys();
       ele3.sendKeys("This is where I am now");
       // elf.click();
        
        
        //CLose the Browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
}
