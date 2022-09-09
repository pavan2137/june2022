package _List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box4_getFirstSlecteedOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize(); // window().maximize()

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(month);
		s.selectByVisibleText("Mar");
		WebElement firstoption = s.getFirstSelectedOption();
		System.out.println(firstoption.getText()); //Mar
		Thread.sleep(2000);

		driver.quit();
	}
}
