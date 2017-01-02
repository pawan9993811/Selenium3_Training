package JavaScriptAction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class JS_actionDemo {
	 //Declare Web Driver variables
	 private static WebDriver driver;
	 private String baseurl;
	 //Declare Extent Reports
	  public static String currentDir = System.getProperty("user.dir");
	 @BeforeTest
	 public void setup() throws IOException{
		 
	        //initialize chrome driver for application to run
		  
	        String chromeDriverLocation = currentDir + "/Driver/chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

	       //If you add the folder with chromedriver.exe to the path then you only need the following line
	       // and you don't need to set the property as listed in the 3 lines above
	       // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
	     
	         driver = new ChromeDriver();
	       //  baseurl="http://www.wikishown.com"; 
	         driver.get("https://www.google.co.in");
	 
	 }
	 
	
	@Test
	public void f() throws Exception {


	/*	//Get Title
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String) js.executeScript("return document.title");
		System.out.println("title : " + title);
		//OUTPUT | title : Google
		
		// Get Domain name
		driver.get("https://www.google.co.in");
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
		String domain = (String) js1.executeScript("return document.domain");
		System.out.println("domain : " + domain);
		//OUTPUT | domain : http://www.google.co.in
			
		//4| Get URL
		driver.get("https://www.google.co.in");
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		String URL = (String) js11.executeScript("return document.URL");
		System.out.println("Full URL : " + URL);
		//OUTPUT | Full URL : https://www.google.co.in/
		
		//	5| Get Attribute | Text
		driver.get("https://www.google.co.in");
		Object exampleDiv = ((JavascriptExecutor) driver).executeScript("return document.getElementById('main');");
		String name = ((WebElement) exampleDiv).getAttribute("class");
		System.out.println(name);
		//OUTPUT | content
		
		//6| Last Modified
		driver.get("https://www.google.co.in");
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		String lastModified = (String) js12.executeScript("return document.lastModified");
		System.out.println("lastModified : " + lastModified);
		//OUTPUT | lastModified : 01/29/2014 14:56:46

		//7| Ready state
		driver.get("https://www.google.co.in");
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		String readyState = (String) js111.executeScript("return document.readyState");
		System.out.println("readyState : " + readyState);
		//OUTPUT | readyState : complete
*/		
		//8| Click()
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.id("u_0_i"));
		WebElement element1 = driver.findElement(By.id("email"));
		takeScreenshotMethod(currentDir+"\\Screenshot");
		highlightelement(element1);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		
		
	}
	
	  
		public static void takeScreenshotMethod(String Destination)
				throws Exception {
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(Destination));
		}
		
		public static void highlightelement(WebElement element) {
			for (int i = 0; i < 4; i++) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript(
						"arguments[0].setAttribute('style', arguments[1]);",
						element, "color: solid red; border: 6px solid yellow;");
				js.executeScript(
						"arguments[0].setAttribute('style', arguments[1]);",
						element, "");

			}

		}
}
