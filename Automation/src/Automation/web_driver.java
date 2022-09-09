package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver {
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.youtube.in/");
         //Thread.sleep(2000);
         
         String tital = driver.getTitle();
         System.out.println("https://www.youtube.in/");
         
         String url = driver.getCurrentUrl();
         System.out.println("https://www.youtube.in/");
         
        // driver.manage().window().maximize();
        // driver.manage().window().minimize();
         
         driver.navigate().to("https://www.youtube.in/");
         driver.navigate().back();
         driver.navigate().forward();
         driver.navigate().refresh();
        
      // Dimension d = new Dimension(100, 200);
     //  driver.manage().window().setSize(d);
       
     //8. setSize()
     		Dimension d = new Dimension(200, 400);// width-200, height-400
     		driver.manage().window().setSize(d);
     		
     		//9. setPosition()
     		Point p = new Point(400, 200);//x-400, y-200
     		driver.manage().window().setPosition(p);
     		
     		Thread.sleep(2000);
     		driver.quit();
      
    
      
        
	}
}
