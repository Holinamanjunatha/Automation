package com.vtiger.objectRepositories;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.V_tiger.genaricutility.WebDriverUtility;

	//import com.vtiger.genericUtilities.WebDriverUtility;

	public class LoginPage extends WebDriverUtility {
	//Declaration
		@FindBy(xpath="//input[@type='text']")private WebElement untext;
		@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtext;
		@FindBy(xpath="//input[@id='submitButton']")private WebElement loginBtn;
	//Initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	//getters
		public WebElement getUntxt() {
			return untext;
		}
		public WebElement getPwdtxt() {
			return pwdtext;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		}
	//Business Library
		public void loginToApp(String UN,String PWD) {
			untext.sendKeys(UN);
			pwdtext.sendKeys(PWD);
			loginBtn.submit();		}

}
