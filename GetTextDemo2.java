package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextDemo2
{

public static void main(String[] args) {

    //System.setProperty("webdriver.chrome.driver", "X://chromedriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://omayo.blogspot.com/");
    List<WebElement> elements = driver.findElements(By.tagName("a"));
    System.out.println("Number of elements:" +elements.size());

    for (int i=0; i<elements.size();i++){
      System.out.println("Text Attribute:" + elements.get(i).getAttribute("href"));
    }
  }
}