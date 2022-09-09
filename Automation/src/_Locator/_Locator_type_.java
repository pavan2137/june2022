package _Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Locator_type_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Automation/pr.html");
		Thread.sleep(2000);

		// 1. tag name
		driver.findElement(By.tagName("input")).sendKeys("pavan raut");
		Thread.sleep(2000);

		// 2. Id
		driver.findElement(By.id("123")).sendKeys("12345678");
		Thread.sleep(2000);
		
		//3. class name
		driver.findElement(By.className("xyz")).sendKeys("56666@gmail.com");
		Thread.sleep(2000);
		
		//4. link and partial link
	//	driver.findElement(By.linkText("link")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("li")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
