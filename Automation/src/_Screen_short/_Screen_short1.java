package _Screen_short;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class _Screen_short1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);

		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		System.out.println(scr);
		
		String random = RandomString.make(4);
		
		File dsc = new File("D:\\Screen Short\\amazon"+random+".png");
		
	    FileHandler.copy(scr, dsc); //copy screenshot c drive to d
		Thread.sleep(2000);
		driver.quit();

	}
}
