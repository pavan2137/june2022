package _Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _locator_type {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("file:///C:/Automation/locator.html");
		Thread.sleep(2000);
		
		//1. tagName
		//driver.findElement(By.tagName("input")).sendKeys("qa@pune.com");
		
		WebElement username = driver.findElement(By.tagName("input"));
		username.sendKeys("qa@pune.com");
		
		Thread.sleep(1000);
		
		//2. id
		driver.findElement(By.id("123")).sendKeys("qa@123");
		Thread.sleep(1000);
		
		//3. className
		driver.findElement(By.className("abcd")).sendKeys("qa@pune.com");
		Thread.sleep(1000);
		
		//4. name
		driver.findElement(By.name("12345")).sendKeys("1234567890");
		Thread.sleep(1000);
		
		driver.quit();
	}
}


