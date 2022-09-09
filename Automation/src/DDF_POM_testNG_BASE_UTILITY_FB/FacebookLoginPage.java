package DDF_POM_testNG_BASE_UTILITY_FB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	@FindBy(xpath="//input[@id='email']")private WebElement UN;
	@FindBy(xpath="//input[@id='pass']")private WebElement PDW;
	@FindBy(xpath="//button[text()='Log In']")private WebElement Login;
	
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setFacebookusername(String username) {
		UN.sendKeys(username);
	}
	public void setFacebookpassword(String password) {
		PDW.sendKeys(password);
	}
	public void clickFacebooklogin() {
		Login.click();
	}
}
