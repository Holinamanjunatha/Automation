package pom.Swaglabs.Pomclasses1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//img[@class='inventory_item_img']")private WebElement backbagbtn;
	@FindBy(xpath="//img[@class='inventory_item_img']")private WebElement bikelightbtn;
	@FindBy(xpath="//img[@class='inventory_item_img']")private WebElement tshitbtn;
	@FindBy(xpath="//img[@class='inventory_details_img']")private WebElement jacketbtn;
	@FindBy(xpath="//img[@class='inventory_item_img']")private WebElement onsitebtn;
	@FindBy(xpath="//img[@class='inventory_item_img']")private WebElement tshirtbtn;
	
	public HomePage(WebElement driver) {
	PageFactory.initElements(driver, this);
	
    }

	public WebElement getBackbagbtn() {
		return backbagbtn;
	}

	public WebElement getBikelightbtn() {
		return bikelightbtn;
	}

	public WebElement getTshitbtn() {
		return tshitbtn;
	}

	public WebElement getJacketbtn() {
		return jacketbtn;
	}

	public WebElement getOnsitebtn() {
		return onsitebtn;
	}

	public WebElement getTshirtbtn() {
		return tshirtbtn;
	}
	
	public void clicktoBag() {
		backbagbtn.click();
	}
	public void clicktoBikeLight() {
		bikelightbtn.click();
	}
	public void clicktoTshirt() {
		tshitbtn.click();
	}
	public void clicktoJacket() {
		jacketbtn.click();
	}
	public void clicktoOnsite() {
		onsitebtn.click();
	}
	public void clicktoTshrit() {
		tshirtbtn.click();
	}
		
		
		
		
		
	
}
