package _Web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Web_element_1234 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	
	//1. sendKeys
  // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("raut@123");
  //  Thread.sleep(2000);
    
    //2.click
   // driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
   // Thread.sleep(2000);
    
    //3. clear
  //  driver.findElement(By.xpath("//input[@name='email']")).clear();
  //  Thread.sleep(2000);
    
    //4. getText
String txt = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).getText();
 System.out.println(txt); //Sign up for Facebook
   Thread.sleep(2000);
    driver.quit();
}
}
