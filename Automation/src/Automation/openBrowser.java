package Automation;


	import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class openBrowser {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver.exe");//key - browser name, value - chrome driver path
			WebDriver driver = new ChromeDriver();
			
			//1. get() - used to open url
			driver.get("https://www.youtube.com/");
			
			// set size
			Dimension d = new Dimension(200, 200);
			driver.manage().window().setSize(d);
			
			Point p = new Point(300, 400);
			driver.manage().window().setPosition(p);
			
			
			//2. close() - used to close single tab of browser
			//driver.close();
			
			//3. quit() - used to close multiple tabs of single browser
			driver.quit();
		}
	
}
