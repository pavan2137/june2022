package Automation;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _open_broweser2 {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// 1 get
		driver.get("https://www.amazon.com/");
		driver.quit();

		// 2 get.tital
		String tital = driver.getTitle();
		System.out.println("tital");
		// 3 get current url
		String url = driver.getCurrentUrl();
		System.out.println("url");
		// 4 maximize
		// driver.manage().window().maximize();
		// 5 minimize
		// driver.manage().window().minimize();
		// 6 navigate
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(2000);
		// 7 set.size

		driver.quit();

	}

}
