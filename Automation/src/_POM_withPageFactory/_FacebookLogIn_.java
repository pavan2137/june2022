package _POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _FacebookLogIn_ {

	@FindBy(xpath = "//input[@id='email']")
	private WebElement un;
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement pdw;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement Login;

	public _FacebookLogIn_(WebDriver driver) {
		PageFactory.initElements(driver, this);
    }

	public void set_facebookusername_() {
		un.sendKeys("7447388606");
	}

	public void set_facebookpassword_() {
		pdw.sendKeys("pavan2137");
    }

	public void click_facebooklogin_() {
		Login.click();
	}
}
