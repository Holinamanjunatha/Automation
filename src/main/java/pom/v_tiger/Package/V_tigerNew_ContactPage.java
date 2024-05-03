package pom.v_tiger.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V_tigerNew_ContactPage {

	@FindBy(xpath="//a[.='Contacts']")private WebElement clickonconmod;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement clickonnewbtn;
	@FindBy(xpath="//input[@name='lastname']")private WebElement enterontxt;
	@FindBy(xpath="//input[@class='crmButton small save']")private WebElement savethebtn;
	
	public V_tigerNew_ContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getClickonconmod() {
		return clickonconmod;
	}

	public WebElement getClickonnewbtn() {
		return clickonnewbtn;
	}

	public WebElement getEnterontxt() {
		return enterontxt;
	}

	public WebElement getSavethebtn() {
		return savethebtn;
	}
	public void clickOnOrgMod() {
		clickonconmod.click();
	}
	public void clickOnNewOrg() {
		clickonnewbtn.click();
	}
	public void enterOnConTxt(String Holina) {
		enterontxt.sendKeys(Holina);
	}
	public void clickOnSavebtn() {
		savethebtn.click();
	}
	
}
