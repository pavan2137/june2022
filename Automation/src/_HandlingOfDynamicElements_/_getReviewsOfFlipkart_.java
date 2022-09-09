package _HandlingOfDynamicElements_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _getReviewsOfFlipkart_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");																								// path
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung note 9");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		String review = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[6]")).getText();
		
		System.out.println(review); // 8 Reviews
		Thread.sleep(2000);
		
		driver.quit();
	}
}
