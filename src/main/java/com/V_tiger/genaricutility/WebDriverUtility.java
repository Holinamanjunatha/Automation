package com.V_tiger.genaricutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	public void maximizeBroser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void minimizeBroser(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	public void waitforPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	public void handleDropDown(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void handleDropDown1(WebElement element,String value) {
		Select s1 = new Select(element);
		s1.selectByValue(value);;
	}
	
	public void handleDropDown1(String visibleText,WebElement element) {
		Select s11 = new Select(element);
		s11.selectByValue(visibleText);
	}
	
	public void mouseOverAction(WebDriver driver,WebElement element) {
		Actions a =new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement element) {
		Actions a1 =new Actions(driver);
		a1.contextClick(element).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions a2 =new Actions(driver);
		a2.doubleClick(element).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement srcele,WebElement destele) {
		Actions a3 =new Actions(driver);
		a3.dragAndDrop(srcele,destele).perform();
	}
	
	public void getScreenshot(WebDriver driver,String sname) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\\\Users\\\\holinamanjunath\\\\Desktop\\\\test"+System.currentTimeMillis()+".png");
		try {
			Files.copy(src, dest);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
