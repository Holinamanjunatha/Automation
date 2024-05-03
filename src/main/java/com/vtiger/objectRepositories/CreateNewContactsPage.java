package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.V_tiger.genaricutility.WebDriverUtility;

public class CreateNewContactsPage extends WebDriverUtility{

			@FindBy(xpath="//input[@name='lastname']")private WebElement enterontxt;
			@FindBy(xpath="//input[@class='crmButton small save']")private WebElement savethebtn;
			
			public CreateNewContactsPage(WebDriver driver) {
				PageFactory.initElements(driver,this);
				
			}

			public WebElement getEnterontxt() {
				return enterontxt;
			}

			public WebElement getSavethebtn() {
				return savethebtn;
			}
			
			public void enterOnConTxt(String Holina) {
				enterontxt.sendKeys(Holina);
				savethebtn.click();
			}
			
}
