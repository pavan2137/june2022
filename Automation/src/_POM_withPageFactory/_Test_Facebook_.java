package _POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Test_Facebook_ {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");

	_FacebookLogIn_ log = new _FacebookLogIn_(driver);
	log.set_facebookusername_();
	log.set_facebookpassword_();
	log.click_facebooklogin_();
	
	Thread.sleep(2000);
	_FacebookAccount_ ac = new _FacebookAccount_(driver);
	ac.set_facebookaccount();
	
	Thread.sleep(2000);
	_FacebookLogout_ lout = new _FacebookLogout_(driver);
	lout.click_facebookLogout();
	
	Thread.sleep(2000);
	driver.quit();
}
}
