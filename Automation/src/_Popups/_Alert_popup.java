package _Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		//
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("5");

		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();

		// 1. to click on OK button
		// alt.accept();

		// 2. to click on CANCLE button
		// alt.dismiss();

		// 3. to get TEXT
		String text = alt.getText();
		System.out.println(text); // Do you really want to delete this Customer?
		driver.quit();
	}
}
