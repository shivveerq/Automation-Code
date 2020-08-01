package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CurrentUrlDemo
{

	public static void main(String args [])
	{
		System.setProperty("WebDriver","C:\\Users\\Tom\\Downloads\\Compressed\\geckodriver");
		WebDriver d = new FirefoxDriver();
		d.get("http://omayo.blogspot.com/");
		String currenturl =d.getCurrentUrl();
		System.out.println(currenturl);
		d.close();
	 
		
		
		
		
	}

}
