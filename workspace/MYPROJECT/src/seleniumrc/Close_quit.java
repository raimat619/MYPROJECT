package seleniumrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_quit 

{

	public static void main(String []args)
	
	{

	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\omm\\Downloads\\chromedriver.exe"); 
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Windows.html");
    System.out.println("hello");
    
    driver.quit();
    
    //System.out.println("hello2");
    //driver.get("www.gmail.com");
    
    //System.out.println("hello3");
    
	}
}
