package _Web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _isSelected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	Thread.sleep(2000);
	
	WebElement male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	male.click();
	Thread.sleep(2000);
	System.out.println(male.isSelected()); //true

	driver.quit();
}
}
