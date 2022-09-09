package _Test_annotation_;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _Test_annotation_ {

	@BeforeClass
	public void openBrowser() { // execute before all test
		
	}
	@BeforeMethod
	public void login() { // execute before each test
		
	}
	@Test //(invocationCount = 5) // when we have execute multiple time
	public void testusername() {
		Reporter.log("username", true);
	}    
	@Test(priority = -1, enabled = false) //when we have execute it first we give priority to its
	public void testpasswords() {         // when we dont have to execute 
		Reporter.log("passwords",true);
	}
	@Test( timeOut = 1000) // when we have to execute it in time
	public void testloginbtn() throws InterruptedException {
		Thread.sleep(2000);
		Reporter.log("loginbtn", true);
	}      
	@Test(dependsOnMethods = {"testusername"}) //one test is depend on other test(method)
	public void testdepends() {
		Reporter.log("dependson", true);
	}    
	@AfterMethod
	public void logout() { // execute after each test     
		
	}
	@AfterClass
	public void closeBrowser() {  // execute after all test
		
	} 
}
