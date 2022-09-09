package DDF_POM_testNG_base_UTILITY_class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





public class _Kite_test_class extends Base {
	_Kite_login_page1 page1;
	_Kite_login_page2 page2;
	_Kite_home_page home;
	_Kite_LogOut_page logout;
	
	@BeforeClass
	public void openbrowser() throws IOException {
		Browseropen();
	page1 = new _Kite_login_page1(driver);
    page2 = new _Kite_login_page2(driver);
    home  = new _Kite_home_page(driver);
    logout = new _Kite_LogOut_page(driver);
		
		
	}
	
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException {
		page1.set_Kite_login_page1Username(Utility.gettestdata(0, 0));
		page1.set_Kite_login_page1password(Utility.gettestdata(0, 1));
		page1.click_Kite_login_page1();
		
		page2.set_Kite_login_page2(Utility.gettestdata(0, 2));
		page2.set_Kite_login_page2();
		
	}
	
	@Test
	public void test() throws EncryptedDocumentException, IOException {
			String expResult = Utility.gettestdata(0, 0);
			String actResult = home.get_Kite_home_page();
			Assert.assertEquals(expResult, actResult, "act & exp result are different");
		
	}
	
	@AfterMethod
	public void logout() {
		home.click_Kite_home_page();  
		logout.click_Kite_LogOut_page();
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
}
