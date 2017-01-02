package Day_3;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class SwitchTab {
	
	 @Test
	    public void startWebDriver() throws InterruptedException{


			//ff >48
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium 3\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		    
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	        capabilities.setCapability("marionette", true);
	        String firefox_binary_path = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
	        capabilities.setCapability("firefox_binary", firefox_binary_path);
	       
	        WebDriver driver = new FirefoxDriver(capabilities);
	        
	        driver.navigate().to("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
	        
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        // Click on the Button "New Message Window"
	        
	        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
	        
	        Thread.sleep(3000);
 
	        // Store and Print the name of all the windows open	              
 
	        Set handles = driver.getWindowHandles();
 
	        System.out.println(handles);
 
	        // Pass a window handle to the other window
 
	        for (String handle1 : driver.getWindowHandles()) {
	        	//handles :- 2 string 
 
	        	System.out.println(handle1);
	        	//streing = window1
 
	        	driver.switchTo().window(handle1);
                 
	        	}
 
	        // Closing Pop Up window
 
	        driver.close();
 
	        // Close Original window
 
	        driver.quit();
 
	}
 
}