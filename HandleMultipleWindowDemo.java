package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleWindowDemo 
{
	public static void main(String args[]) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> set = driver.getWindowHandles();
		// Iterative statement for multiple window
		for(String temp:set)
		{
			System.out.println(temp);
		}/*
	//Iterator loop for set
		Iterator<String> itr1 = set.iterator();
		while(itr1.hasNext())
			{
			 System.out.println(itr1.hasNext());
			 
			} */    
		Iterator<String> itr2 = set.iterator();
		String mainwindow = itr2.next();
		String childwindow = itr2.next();
		driver.switchTo().window("childwindow");//Switching  to focus child window 
		String str = driver.findElement(By.id("para1")).getText();	
		System.out.println("Test of Paragraph of child window is :"+str);
	}

}
