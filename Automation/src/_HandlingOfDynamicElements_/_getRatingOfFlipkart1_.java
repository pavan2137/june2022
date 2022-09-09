package _HandlingOfDynamicElements_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _getRatingOfFlipkart1_ {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
	WebDriver driver = new ChromeDriver();

	// 6. maximize()
	driver.manage().window().maximize();

	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("realme 9");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	
	//1. DynamicElements
	String rating = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[4]//span)[4]")).getText();
	System.out.println(rating); //16,849 Ratings 
	Thread.sleep(2000);
	driver.quit();
}
}
