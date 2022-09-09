package _Autosuggetion_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Autosuggetion_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");

		List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));

		for (WebElement option : alloption) {
			System.out.println(option.getText());
		}
	}

}
