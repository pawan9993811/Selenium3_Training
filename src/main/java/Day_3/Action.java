package Day_3;


import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class Action {
	
	 @Test
	    public void startWebDriver() throws InterruptedException{


	        /* The following code is for the Chrome Driver
	           You also need to download the ChromeDriver executable
	           https://sites.google.com/a/chromium.org/chromedriver/
	         */
	        String currentDir = System.getProperty("user.dir");
	         String chromeDriverLocation = currentDir + "/Driver/chromedriver.exe";
	         System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

	         WebDriver driver = new ChromeDriver();
	         driver.navigate().to("https://www.amazon.in/");
	        
	         WebElement moveTo = driver.findElement(By.xpath("//*[@id='nav-link-wishlist']"));
		        
	         
	        Actions mouse =new Actions(driver);
	        
	       // mouse.moveToElement(moveTo).build().perform();
	        
	        mouse.moveToElement(moveTo).build().perform();
	        
	         Thread.sleep(3000);
	    
	       //Right Click   
	       mouse.contextClick().build().perform();
	 
	        /* driver.close();
	        driver.quit();*/

	    }

}
