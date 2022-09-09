package _Action_class;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customized_listBox3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.findElement(By.xpath("(//a[contains(text(),'Sign')])[1]")).click();
	
	driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	
	for(int i=0; i<=6; i++) {
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		//driver.quit();
	}
}
}
