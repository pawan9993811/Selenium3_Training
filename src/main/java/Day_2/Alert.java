package Day_2;


import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class Alert {
	
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
	         driver.navigate().to("http://www.javascripter.net/faq/alert.htm");
	         
	         WebElement try_button = driver.findElement(By.cssSelector("html>body>p>table>tbody>tr>td>form>input"));
	         try_button.click();
	         Thread.sleep(5000);
	         
	         System.out.println(driver.switchTo().alert().getText());
		       
	         //Click on OK button in Alert 
	         driver.switchTo().alert().accept();
	     
	        driver.close();
	        driver.quit();

	    }

}
