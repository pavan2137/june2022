package _Action_class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _DropDownList_moveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		// Action act = new Action(driver); use 'Actions' when we don't have Select tag
		// name
		Actions act = new Actions(driver);
        // 1. moveToElement
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		// 2. contextClick
		//act.contextClick(login).perform(); // to perform right click
		//Thread.sleep(2000);
		// 3. click
	//	act.click(login).perform(); // to perform left click
	//	Thread.sleep(2000);
		driver.quit();
	}
}
