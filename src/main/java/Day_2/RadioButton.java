package Day_2;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class RadioButton {
	public static WebDriver driver;
	 @Test
	    public void startWebDriver() throws InterruptedException{


	        /* The following code is for the Chrome Driver
	           You also need to download the ChromeDriver executable
	           https://sites.google.com/a/chromium.org/chromedriver/
	         */
	        String currentDir = System.getProperty("user.dir");
	         String chromeDriverLocation = currentDir + "/Driver/chromedriver.exe";
	         System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

	          driver = new ChromeDriver();
	         driver.navigate().to("http://www.echoecho.com/htmlforms10.htm");
	         Thread.sleep(3000);
	         
	         //Click on 1st Radio Button
	         driver.findElement(By.xpath("//*[@name='radio1']")).click();
	         Thread.sleep(2000);
	         
	         //Incase locator value is dynamic 
	         List<WebElement> radio_button = driver.findElements(By.xpath("//*[@type='radio']"));
	       
	        System.out.println(radio_button.size());
	        radio_button.get(1).click();
	        
	        Thread.sleep(5000);
	         
	       
	        /* driver.close();
	        driver.quit();*/

	    }
	 
}
