package _Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Insta_locator_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\raut5\\\\\\\\Downloads\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[aria-label=\"Phone number, username, or email\"]"))
				.sendKeys("raut pavan");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("123456");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[class=\"sqdOP  L3NKy   y3zKF     \"]")).click();
		Thread.sleep(2000);

		driver.navigate().to("https://www.instagram.com/accounts/login/?");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("span[class=\"KPnG0\"]")).click();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
