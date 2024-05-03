package com.V_tiger.genaricutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pom.Swaglabs.Pomclasses.LoginPage;

public class BaseClass {
	public PropertyFileUtility pu = new PropertyFileUtility();
	public ExcelFileUtility eu = new ExcelFileUtility();
	public WebDriverUtility wu = new WebDriverUtility();
	public JavaUtility ju = new JavaUtility();
	public WebDriver driver = null;//runtime poilymorphism
	
	@BeforeSuite
	public void bsconfig() {
		System.out.println("====DB connection====");
	}
	@AfterSuite
	public void asconfig() {
		System.out.println("====DB disconnection===");
	}
	
	@BeforeClass
	public void bcconfig() throws IOException {
		String BROWSER = pu.readDataFromPropertyFile("browser");
		String URL = pu.readDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("edge")) {
	     driver=new EdgeDriver();
	     System.out.println("edge driver is launched");
	    }
	    else if(BROWSER.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		System.out.println("chrome driver is launched");
	}
	else
	{
		System.out.println("invalid browser insert name");
	}
	driver.get(URL);
	wu.getScreenshot(driver,"LoginPage");
	wu.maximizeBroser(driver);
	wu.waitforPageLoad(driver);
}

   //after  class
	@AfterClass 
   public void terDown() {
	driver.quit();
   }
   //before method
   @BeforeMethod
   public void bmconfig() throws IOException {
	   String UN=pu.readDataFromPropertyFile("una");
	   System.out.println(UN);
	   String PWD=pu.readDataFromPropertyFile("pwda");
	   LoginPage lp=new LoginPage(driver);
	   lp.loginToApp(UN, PWD);
	   wu.getScreenshot(driver,"Homepage");
   }
   //after method
   @AfterMethod
   public void amconfig() {
	   System.out.println("logout from app");
   }
 }
