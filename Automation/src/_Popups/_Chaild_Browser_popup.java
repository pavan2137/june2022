package _Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Chaild_Browser_popup { 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
        
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(2000);
		
		//idOfMainPage
	//	String idOfMainPage = driver.getWindowHandle();
	//	System.out.println(idOfMainPage);//CDwindow-E920A1E2371E19C6CCD2581C8B15C75A
		
		//idOfMainPage , idOfChaild
	//	Set<String> idOfChaild = driver.getWindowHandles();
	//	System.out.println(idOfChaild);
		//[CDwindow-CE68A99AD5CB8D1DFA1F441F57466821, CDwindow-78B9A10D9F309039F6F9E7F0895C5CD6]
		
		Set<String> ido = driver.getWindowHandles();
		
		 ArrayList<String> id = new ArrayList<>(ido);
		 System.out.println(id.get(0));
		 
		 System.out.println(id.get(1));
		 
		driver.switchTo().window(id.get(1));
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[@class='menu-text'])[18]")).click();
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(id.get(0));
		driver.findElement(By.xpath("(//input[@class='btn'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
