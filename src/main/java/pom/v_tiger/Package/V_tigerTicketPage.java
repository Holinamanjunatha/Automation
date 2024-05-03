package pom.v_tiger.Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V_tigerTicketPage {

	@FindBy(xpath="//span[.='[ ACC7 ] Test -  Organization Information']")private WebElement tickettxt;
	
	public V_tigerTicketPage( WebElement driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getTickettxt() {
		return tickettxt;
	}
	public void ticketMethod() {
		
	}
}