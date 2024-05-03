package com.vtiger.objectRepositories;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.V_tiger.genaricutility.WebDriverUtility;

	//import com.vtiger.genericUtilities.WebDriverUtility;
	public class OrganizationInformationPage extends WebDriverUtility {
	//Declaration
		@FindBy(xpath="//span[@class='dvHeaderText']")private WebElement orgTicket;
	//Initailization
		public OrganizationInformationPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	//Getters
		public WebElement getOrgNameedt() {
			return orgTicket;
		}
	
		//Business Library
		public  String getHeader()
		{
			return orgTicket.getText();
		    
		}
	
}
