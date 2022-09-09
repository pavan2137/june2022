package DDF_POM_testNG_base_UTILITY_class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class _Kite_login_page1 {

	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PDW;
	@FindBy(xpath="//button[text()='Login ']")private WebElement LOGIN;
	
	public _Kite_login_page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void set_Kite_login_page1Username(String username) {
		UN.sendKeys(username);
	}
	public void set_Kite_login_page1password(String password) {
		PDW.sendKeys(password);
	}
	public void click_Kite_login_page1() {
		LOGIN.click();
	}
}
