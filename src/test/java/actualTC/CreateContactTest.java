package actualTC;

import org.testng.Assert;

import com.V_tiger.genaricutility.BaseClass;
import com.vtiger.objectRepositories.ContactInformationPage;
import com.vtiger.objectRepositories.ContactPage;
import com.vtiger.objectRepositories.CreateNewContactsPage;
import com.vtiger.objectRepositories.HomePage;

public class CreateContactTest extends BaseClass {

	public void createcontact() {
	HomePage ht= new HomePage(driver);
	ht.clickonContactsLink();
	ContactPage con = new ContactPage(driver);
	con.clickOnNewOrg();
	CreateNewContactsPage cc = new CreateNewContactsPage(driver);
	cc.enterOnConTxt("rcb"+ju.getRandomNum());
	ContactInformationPage cip = new ContactInformationPage(driver);
	String Ge = cip.getHeader1();
	//verify
	Assert.assertTrue(Ge.contains("rcb"));
	System.out.println("===Contact is created and tc is pass===");
	}
	
}
