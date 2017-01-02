package Day_2;


import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
	
	 @Test
	    public void startWebDriver(){


	        /* The following code is for the Chrome Driver
	           You also need to download the ChromeDriver executable
	           https://sites.google.com/a/chromium.org/chromedriver/
	         */
	        String currentDir = System.getProperty("user.dir");
	         String chromeDriverLocation = currentDir + "/Driver/chromedriver.exe";
	         System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

	         WebDriver driver = new ChromeDriver();
	         driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
	         
	         //dropdown
	      WebElement dropDownLocation = driver.findElement(By.xpath("//form/table/tbody/tr[12]/td[2]/select"));
	      Select dropdown=new Select(dropDownLocation);
	         
	         // dropdown.selectByValue("22");
	         // dropdown.selectByIndex(1);
	          dropdown.selectByVisibleText("ARGENTINA");
	         
	        
	        driver.close();
	        driver.quit();

	    }

}
