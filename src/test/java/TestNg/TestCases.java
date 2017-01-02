package TestNg;


import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

//@Listeners(Pakage.class) to implement listener 
//@Listeners(TestNg.ListenerTest.class)			

public class TestCases  {				
				

//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
   
 String currentDir = System.getProperty("user.dir");
  String chromeDriverLocation = currentDir + "/Driver/chromedriver.exe";
  System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

  WebDriver driver = new ChromeDriver();
  driver.navigate().to("http://www.fb.com/");

 
 driver.close();
 driver.quit();					
    				
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}	