package _Action_class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customized_listBox1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Actions act = new Actions(driver); // keybord can interact with browser with the help of _Action_class;

		// 1. click
		act.click(month).perform();
		Thread.sleep(2000);

		// 2. perform
		 act.sendKeys(Keys.ARROW_UP).perform();
		 act.sendKeys(Keys.ARROW_UP).perform();
		 act.sendKeys(Keys.ARROW_UP).perform();//Mar

		Thread.sleep(2000);

		// 3.sendKeys
		driver.quit();
	}
}
