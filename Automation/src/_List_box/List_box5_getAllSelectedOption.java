package _List_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box5_getAllSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// key -
		// browsername,
		// value -//
		// chrome driver
		// // path
		driver.manage().window().maximize(); // 6. maximize()

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s = new Select(year);
		List<WebElement> allselect = s.getAllSelectedOptions();

		// for each
		for (WebElement option : allselect) {
			System.out.println(option.getText()); // 2022

			driver.quit();
		}

	}
}
