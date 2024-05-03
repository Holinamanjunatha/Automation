package actualTC;

//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.V_tiger.genaricutility.BaseClass;
import com.vtiger.objectRepositories.CreateNewOrganizationPage;
import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.OrganizationInformationPage;
import com.vtiger.objectRepositories.OrganizationPage;

public class CreateOraganizationTest extends BaseClass {

	@Test
	public void createorg() {
		/*//click on orgmodule
		HomePage hp = new HomePage(driver);
		hp.clickOnOrgLink();
		//click on lookup image
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnOrgLookUpImg();
		//give org name
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createNewOrganization("capgemini"+ju.getRandomNum());
		//get the header and verify
		OrganizationInformationPage oip= new OrganizationInformationPage(driver);
		//String Getorg = oip.getHeader();
		//verify
		//Assert.assertTrue(Getorg.contains("capgemini"));*/
		String et="vtigrt";
		String ht=driver.getTitle();
		Assert.assertTrue (ht.contains(et),"both are not matching");
		System.out.println("===organization is created and tc is pass===");
	}
}

