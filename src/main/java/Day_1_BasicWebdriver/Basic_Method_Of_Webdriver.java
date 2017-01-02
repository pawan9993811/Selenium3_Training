package Day_1_BasicWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Basic_Method_Of_Webdriver {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium 3\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        String firefox_binary_path = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
        capabilities.setCapability("firefox_binary", firefox_binary_path);
        WebDriver driver = new FirefoxDriver(capabilities);
        
        
        System.out.println("Opening Browser "+capabilities.getBrowserName()+capabilities.getVersion());

         // Nevigate to google
         driver.navigate().to("http://www.google.com");
               
         //No back option 
        // driver.get("http://www.google.com");
        
         //Current URL 
        System.out.println(driver.getCurrentUrl());
        
        //Get title of Browser
        System.out.println(driver.getTitle());
        
        //HTML Page source 
        //System.out.println(driver.getPageSource());
        
        //Close browser
        driver.close();
        
        //Quit Driver session 
        driver.quit();
		
	}

}
