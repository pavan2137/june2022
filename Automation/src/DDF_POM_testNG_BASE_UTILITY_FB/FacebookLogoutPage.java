package DDF_POM_testNG_BASE_UTILITY_FB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogoutPage {

	@FindBy(xpath="//span[contains(text(),'Log')]")private WebElement Logout;
	
	public FacebookLogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickfacebooklogoutbott() {
		Logout.click();
	}

	
}
