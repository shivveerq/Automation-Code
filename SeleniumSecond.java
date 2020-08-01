package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSecond {

	public static void main(String[] args)
	{
		System.setProperty("WebDriver","C:\\Users\\Tom\\Downloads\\Compressed\\geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println("Title of the Web Page :-"+title);
		

	}

}
