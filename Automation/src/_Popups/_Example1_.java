package _Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Example1_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
        // to get id of child
		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[contains(text(),'Click me ')]")).click();
		Thread.sleep(2000);
		
		// to get again id of parent
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
