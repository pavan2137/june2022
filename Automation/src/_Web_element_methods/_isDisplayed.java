package _Web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _isDisplayed {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	//boolean result = driver.findElement(By.xpath("//img[@class='_97vu img']")).isDisplayed();
	//System.out.println(result); //true
	Thread.sleep(2000);
	boolean result = driver.findElement(By.xpath("//img[@class='aaa_97vu img']")).isDisplayed();
	System.out.println(result); //NoSuchElementException
	Thread.sleep(2000);
	// _isDisplayed show true condition otherwise it show the exception
	
	try { // what actually we try
		WebElement logo = driver.findElement(By.xpath("//img[@class='aaa_97vu img']"));
		result=logo.isDisplayed();
	}catch (Exception e) { // what actually system show(or we catch)
		result=false;
	}
	driver.quit();
	

}
}
