package _List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box1_Select {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//select[@id='day']")).click();
	//Thread.sleep(2000);
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	
	Select s = new Select(day); // day is web element
	
	//s.selectByIndex(0); // int.arg
	s.selectByValue("20"); // value.arg
	//s.selectByVisibleText("30"); // VisibleText.arg
	
	driver.quit();
}
}
