package _Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _X_path {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raut pavan"); //X path Attribute Id
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("12345678"); //X path Attribute name
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']")).sendKeys("12345678");
		Thread.sleep(2000); //X path Attribute class
		
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click(); //X path text()
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='nav-a  '][2]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
