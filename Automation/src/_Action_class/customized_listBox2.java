package _Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customized_listBox2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");

	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	
	Actions act = new Actions(driver);
	
	act.click(year).perform();
	
	for(int i=0; i<=10; i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
	}
}
}
