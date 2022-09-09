package DDF_POM_testNG_base_UTILITY_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _Kite_home_page {

	@FindBy(xpath="//span[@class='user-id']")private WebElement code;
	
	public _Kite_home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String get_Kite_home_page() {
		String actResult = code.getText();
		return actResult;
		
	}
	public void click_Kite_home_page() {
		code.click();
	}
	}
	
	

