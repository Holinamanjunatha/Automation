package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.V_tiger.genaricutility.WebDriverUtility;

public class ContactPage extends WebDriverUtility{
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement clickonnewbtn;
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

 	public WebElement getClickonnewbtn() {
	return clickonnewbtn;
 	}
 	
	public void clickOnNewOrg() {
		clickonnewbtn.click();
	}
 	
 	}
