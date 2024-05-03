package pom.v_tiger.Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V_tigerLoginPage {

	@FindBy(xpath="//input[@name='user_name']")private WebElement usertxt;
	@FindBy(xpath="//input[@name='user_password']")private WebElement passwordtxt;
	@FindBy(xpath="//input[@id='submitButton']")private WebElement loginbtn;
	

	public V_tigerLoginPage(WebElement driver) {
	  PageFactory.initElements(driver, this);
	
	}


	public WebElement getUsertxt() {
		return usertxt;
	}


	public WebElement getPasswordtxt() {
		return passwordtxt;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}  
	
	public void enterUsername(String Un,String Pw) {
		usertxt.sendKeys(Un);
		passwordtxt.sendKeys(Pw);
		loginbtn.click();
	}

}
