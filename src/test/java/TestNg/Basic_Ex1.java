package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Basic_Ex1 {
  public static WebDriver driver=null;

 
  @BeforeSuite
  public void beforeSuite() {

  System.out.println("===================@BeforeSuite============");
  
  }

  
  @BeforeClass
  public void beforeClass() {
	  
	  
System.out.println("+++++++++++++++++++@BeforeClass++++++++++++");

	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("====================@BeforeMethod+++++++++++++ ");
	  

  }
  
  
  @BeforeTest
  public void beforeTest() {
  
  System.out.println("=======================@BeforeTest==============");
  
  }
  
  
  @Test
  public void main() {
	
	System.out.println("Test.......");
	System.out.println("Test.......");
	System.out.println("Test.......");
	System.out.println("Test.......");
	
	
  }
  

  @AfterMethod
  
	  public void tearDown() {
	  
	  System.out.println("====================@AfterMethod+++++++++++++ ");
	  
	      
	  }
  


  @AfterClass
  public void afterClass() {
 
	  System.out.println("====================@Afterclass+++++++++++++ ");
		 
  
  }

  

  @AfterTest
  public void afterTest() {
	  System.out.println("====================@AfterTest+++++++++++++ ");
		 
  }

  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("====================@Aftersuit+++++++++++++ ");
		 
  
  }



}