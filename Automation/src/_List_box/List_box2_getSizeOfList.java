package _List_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box2_getSizeOfList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		List<WebElement> options = s.getOptions();
		
	//	int size = options.size();
		//System.out.println(size);// 31
		// print all option in list box by using for each
		
		for(WebElement option:options) {
		System.out.println(option.getText());
		Thread.sleep(2000);
		//driver.quit();
			
		}
	}
}