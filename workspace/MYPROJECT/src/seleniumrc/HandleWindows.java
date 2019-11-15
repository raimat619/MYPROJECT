package seleniumrc;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows 

{

	public static void main(String []args)
	
	{
	
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omm\\Downloads\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        System.out.println("new Window :"+ driver.getTitle());
        driver.manage().window().maximize();

        
       WebElement child = driver.findElement(By.xpath("//button[@class='btn btn-info']")); 
       child.click();
       System.out.println("new Window :"+ driver.getTitle());
      
       Set<String> str =  driver.getWindowHandles();
       Iterator iter = (Iterator) str.iterator();
       
       
        driver.close();
        
        
	}
}
