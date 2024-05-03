package pom.Swaglabs.Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(xpath="//input[@id='user-name']")private WebElement untxt;
	@FindBy(xpath="//input[@name='password']")private WebElement pstxt;
	@FindBy(xpath="//input[@name='login-button']")private WebElement loginbtn;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUntxt() {
		return untxt;
	}

	public WebElement getPstxt() {
		return pstxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	//Business Library
	public void loginToApp(String Un,String Pwd) {
		untxt.sendKeys(Un);
		pstxt.sendKeys(Pwd);
		loginbtn.click();
	}
}
