package _Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _FB_locator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		// 1. css Selector
		driver.findElement(By.cssSelector("input[aria-label=\"Email address or phone number\"]"))
				.sendKeys("pavan raut");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("pvn@123");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[data-testid=\"royal_login_button\"]")).click();
		Thread.sleep(2000);

		 driver.findElement(By.partialLinkText("Forgotten password?")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
