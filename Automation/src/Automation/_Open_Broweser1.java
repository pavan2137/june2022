package Automation;

import java.awt.Dimension;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Open_Broweser1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		//1 driver.getTitle();
		 String Title  = driver.getTitle();
		// System.out.println("Title");
		 
		 //2 driver.getcurrentUrl();
		 String url = driver.getCurrentUrl();
		// System.out.println("url");
		 
	
		 
		 //3 Maximize();
	     // driver.manage().window().maximize();	
	      
	      //4 minimize();
	     // driver.manage().window().minimize();
	      
	      //5 Navigate();
	      driver.navigate().to("https://www.youtube.com/");
	      
	      driver.get("https://www.flipkart.com/");
	      driver.navigate().to("https://www.flipkart.com/");
	      
	      driver.navigate().back();
	      driver.navigate().forward();
	      driver.navigate().refresh();
	      
	  
		//driver.quit();
		
		
	}
}