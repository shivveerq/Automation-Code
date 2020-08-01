package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirst 
{
	private static final int SECOND = 0;

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("WebDriver","C:\\Users\\Tom\\Downloads\\Compressed\\geckodriver");
		WebDriver driver = new FirefoxDriver();
		String baseurl="https://omayo.blogspot.com/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.findElement(By.id("multiselect1")).click();
	//    Thread.sleep(100,SECOND);
	//	driver.findElement(By.id("link1")).click();
		driver.findElement(By.className("combobox")).click();
		//driver.close();
	}

}
