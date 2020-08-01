package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetattributeDemo 
{
	public static void main(String args[])
			{
		System.setProperty("WebDriver","C:\\Users\\Tom\\Downloads\\Compressed\\geckodriver");
		WebDriver d = new FirefoxDriver();
		String baseurl = "http://omayo.blogspot.com/";
		d.manage().window().maximize();
		d.get("http://omayo.blogspot.com/");
		String attributevalue= d.findElement(By.id("ironman2")).getAttribute("value");
		System.out.println(attributevalue);

		
			}

}
