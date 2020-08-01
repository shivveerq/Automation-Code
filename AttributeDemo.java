package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeDemo
{
	public static void main(String args[])
	{
		System.setProperty("WebDriver","C:\\Users\\Tom\\Downloads\\Compressed\\geckodriver");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://omayo.blogspot.com/");
		String currenturl = d.getCurrentUrl();
		System.out.println(currenturl);
		d.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//d.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
		//d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();		
	}
}