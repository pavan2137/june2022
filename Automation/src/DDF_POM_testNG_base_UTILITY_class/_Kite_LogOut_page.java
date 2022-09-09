package DDF_POM_testNG_base_UTILITY_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _Kite_LogOut_page {

	@FindBy(xpath="//a[contains(text(),'Logout')]")private WebElement LOGOUT;
	
	public _Kite_LogOut_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void click_Kite_LogOut_page() {
		LOGOUT.click();
	}
}
