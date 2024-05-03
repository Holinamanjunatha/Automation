package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.V_tiger.genaricutility.WebDriverUtility;

public class ContactInformationPage extends WebDriverUtility{
	
	@FindBy(xpath="//span[@class='dvHeaderText']")private WebElement conticket;
	//@FindBy(xpath="//input[@class='crmbutton small save']")private WebDriver savebtnc;
	public ContactInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getconticket() {
		return conticket;
		
	}
	public String getHeader1() {
		return conticket.getText();
		
	}
}
