package _POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _FacebookLogout_ {

	@FindBy(xpath="(//div[@class='alzwoclg cqf1kptm siwo0mpr gu5uzgus'])[6]")private WebElement out;
		
	public _FacebookLogout_(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void click_facebookLogout() {
		out.click();
	}
	}
	
		
	

