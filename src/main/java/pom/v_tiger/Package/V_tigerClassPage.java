package pom.v_tiger.Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V_tigerClassPage {
	
	
	
	@FindBy(xpath="//a[.='Organizations']")private WebElement orgmod;
	@FindBy(xpath="//a[.='Contacts']")private WebElement contmod;
	@FindBy(xpath="//a[.='Opportunities']")private WebElement optmod;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")private WebElement adminimg;
	@FindBy(xpath="//a[.='Sign Out']")private WebElement signbtn;
	
	public V_tigerClassPage(WebElement driver) {
	  PageFactory.initElements(driver, this);
	
	}

	public WebElement getOrgmod() {
		return orgmod;
	}

	public WebElement getContmod() {
		return contmod;
	}

	public WebElement getOptmod() {
		return optmod;
	}

	public WebElement getAdminimg() {
		return adminimg;
	}

	public WebElement getSignbtn() {
		return signbtn;
	}
	public void clickonOrg() {
		orgmod.click();
	}
	public void clickonContact() {
		contmod.click();
	}
	public void clickonOpportunities() {
		optmod.click();
	}
	public void clickonimg() {
		adminimg.click();
	}
	public void clickonSignOut() {
		signbtn.click();
	}
	
	
	

}
