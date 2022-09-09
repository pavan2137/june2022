package DDF_POM_testNG_BASE_UTILITY_FB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {

	@FindBy(xpath="//div[@aria-label='Your profile']")private WebElement ACC;
	@FindBy(xpath="(//span[text()='Raut Pavan'])[1]")private WebElement Rst;
	
	public FacebookHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickFacebookacc() {
		ACC.click();
	}
	public String Facebookresult() {
		String actresult = Rst.getText();
		return actresult;
		
		
		
	}
}
