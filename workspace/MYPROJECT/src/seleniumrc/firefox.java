package seleniumrc;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
  

public class firefox 

{
	public static void main(String[] args) {  
        
        // System Property for Gecko Driver   
System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");  
        
        WebDriver driver = new FirefoxDriver();
         driver.get("http://book.theautomatedtester.co.uk/chapter1");
         driver.manage().window().maximize();
	}
	
}