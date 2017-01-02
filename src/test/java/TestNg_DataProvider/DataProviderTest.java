package TestNg_DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
 
import org.testng.annotations.Test;
 
public class DataProviderTest {
 
	public static WebDriver driver;
 
  @DataProvider(name = "Authentication")
 
  public static Object[][] credentials() {
 
        return new Object[][] { { "testuser_1", "Test@123" }, 
        		              { "testuser_1", "Test@123" }};
 
  }
 
  // Here we are calling the Data Provider object with its Name
 
  @Test(dataProvider = "Authentication")
 
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