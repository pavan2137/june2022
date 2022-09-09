package _Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Chaild_Browser_popup_prctis {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");

		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(2000);

		Set<String> id = driver.getWindowHandles();

		ArrayList<String> ids = new ArrayList<>(id);
		System.out.println(ids.get(0)); // CDwindow-65E9A743A119AF9970DF51C427A6FF2D
		System.out.println(ids.get(1)); // CDwindow-BCAB932A4340CC0D46C42EA563941DEE

		driver.switchTo().window(ids.get(1));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		driver.close();
		
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		
		Thread.sleep(6000);
		driver.quit();
	}
}
