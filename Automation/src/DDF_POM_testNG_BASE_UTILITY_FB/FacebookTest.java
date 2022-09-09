package DDF_POM_testNG_BASE_UTILITY_FB;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest extends base {

	FacebookLoginPage login;
	FacebookHomePage home;
	FacebookLogoutPage logout;
	
	@BeforeClass
	public void openbrowser() throws IOException {
		browseropen();
		 login = new FacebookLoginPage(driver);
		 home = new FacebookHomePage(driver);
		 logout = new FacebookLogoutPage(driver);
		
		
	}
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException {
		login.setFacebookusername(utility.getTestData(0, 0));
		login.setFacebookpassword(utility.getTestData(0, 1));
		login.clickFacebooklogin();
		
		home.clickFacebookacc();
	}
	@Test
	public void TC1() throws EncryptedDocumentException, IOException {
		String expresult = utility.getTestData(0 ,2);
		String actresult = home.Facebookresult();
		
		Assert.assertEquals(expresult, actresult, "act & exp result are diffrent");
		
		
	}
	@AfterMethod
	public void logout(ITestResult result) throws IOException {
		if(result.getStatus()== ITestResult.FAILURE) {
			int testID = 201;
			utility.getscreenshort(driver, testID);
		}
		logout.clickfacebooklogoutbott();
		
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
		
	}
}
