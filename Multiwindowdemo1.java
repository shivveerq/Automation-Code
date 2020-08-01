package Selenium;

import java.util.Set;
import java.util.Collection;
import javax.swing.text.html.HTMLDocument.Iterator;
//import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.java.util.Iterator<String>;
public class Multiwindowdemo1 
{

	public static void main(String[] args)throws NoAlertPresentException, InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		//Find element 
		driver.findElement(By.name("")).click();
		
			     
	
			     
				
		
	}

}
