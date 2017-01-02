package Day_1_BasicWebdriver;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Waittypes {
	public static WebDriver driver =null;
    @Test
    public void startWebDriver(){


        /* The following code is for the Chrome Driver
           You also need to download the ChromeDriver executable
           https://sites.google.com/a/chromium.org/chromedriver/
         */
        String currentDir = System.getProperty("user.dir");
         String chromeDriverLocation = currentDir + "/Driver/chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
      
          driver = new ChromeDriver();
         driver.navigate().to("http://newtours.demoaut.com/");

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         WebElement myDynamicElement = driver.findElement(By.id("myDynamicElement"));
         
         Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
        		       .withTimeout(30, TimeUnit.SECONDS)
        		     .pollingEvery(1, TimeUnit.SECONDS)
        		       .ignoring(NoSuchElementException.class);
        		 
        		    WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
        		    {
        		      public WebElement apply(WebDriver driver) {
        		        return driver.findElement(By.id("foo"));
        		     }
        		   });
         
        
        driver.close();
        driver.quit();

    }
    
    
    
    public WebElement getWhenVisible(By locator, int timeout) {
    	 
    	WebElement element = null;
    	 
    	WebDriverWait wait = new WebDriverWait(driver, timeout);
    	 
    	element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    	 
    	return element;
    	 
    	}
    	
    public void clickWhenReady(By locator, int timeout) {
     
    WebElement element = null;
     
    WebDriverWait wait = new WebDriverWait(driver, timeout);
     
    element = wait.until(ExpectedConditions.elementToBeClickable(locator));
     
    element.click();
     
     }
}
