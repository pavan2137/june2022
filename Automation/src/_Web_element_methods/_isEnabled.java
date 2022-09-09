package _Web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _isEnabled {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	System.out.println(login.isEnabled()); //true
	Thread.sleep(2000);
	driver.quit();
}
}
