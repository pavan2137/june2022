package DDF_POM_testNG_base_UTILITY_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _Kite_login_page2 {

	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[contains(text(),'Continue ')]")private WebElement CONT;
	
	public _Kite_login_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void set_Kite_login_page2(String pin) {
		PIN.sendKeys(pin);
	}
	public void set_Kite_login_page2() {
		CONT.click();
	}
}
