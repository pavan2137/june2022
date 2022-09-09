package _POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _FacebookAccount_ {

	@FindBy(xpath="//div[@aria-label='Your profile']")private WebElement acc;
	
	
	public _FacebookAccount_(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void set_facebookaccount() {
		acc.click();
	}
	
}
