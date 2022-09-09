package _List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box3_isMultiple {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize(); // window().maximize()

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s = new Select(year);
		boolean result = s.isMultiple(); //false
		System.out.println(result);
		driver.quit();
	}
}
