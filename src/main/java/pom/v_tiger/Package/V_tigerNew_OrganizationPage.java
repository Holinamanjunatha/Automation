package pom.v_tiger.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V_tigerNew_OrganizationPage {

	@FindBy(xpath="//a[.='Organizations']")private WebElement createorgmod;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement lookupbtn;
	@FindBy(xpath="//input[@name='accountname']")private WebElement enterorgtxt;
	@FindBy(xpath="//input[@class='crmbutton small save']")private WebElement clickonbtn;
	
	public V_tigerNew_OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getCreateorgmod() {
		return createorgmod;
	}

	public WebElement getLookupbtn() {
		return lookupbtn;
	}

	public WebElement getEnterorgtxt() {
		return enterorgtxt;
	}

	public WebElement getClickonbtn() {
		return clickonbtn;
	}
	
	public void clickonorgmod() {
		createorgmod.click();
	}
	public void clickonloopbtn() {
		lookupbtn.click();
	}
	public void clickonorgname(String Newzon9) {
		enterorgtxt.sendKeys(Newzon9);
	}
	public void clickonSavebtn() {
		clickonbtn.click();
	}
}
