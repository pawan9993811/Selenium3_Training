package TestNg_DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.Test;
 
import org.testng.annotations.Parameters;
 
public class TestngParameters {
 
	private static WebDriver driver;
 
  @Test 
 
  @Parameters({ "sUsername", "sPassword" })
 
  public void test(String sUsername, String sPassword) {
 
	  String currentDir = System.getProperty("user.dir");
      String chromeDriverLocation = currentDir + "/Driver/chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

     //If you add the folder with chromedriver.exe to the path then you only need the following line
     // and you don't need to set the property as listed in the 3 lines above
     // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
   
      WebDriver driver = new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("http://www.fb.com");
 
 
      driver.findElement(By.id("email")).sendKeys(sUsername);
 
      driver.findElement(By.id("pass")).sendKeys(sPassword);
 
      driver.quit();
 
  }
 
}