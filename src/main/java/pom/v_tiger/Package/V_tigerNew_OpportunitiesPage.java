package pom.v_tiger.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class V_tigerNew_OpportunitiesPage {

	@FindBy(xpath="//a[.='Opportunities']")private WebElement clickonbtn;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement clickonnewbtn;
	@FindBy(xpath="//input[@name='potentialname']")private WebElement opnametxt;
	@FindBy(xpath="//select[@id='related_to_type']")private WebElement dropdonebtn;
	
	public V_tigerNew_OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
}
