package _testNG_MultiBrowserTesting_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _MultiBrowser_ {

	@Parameters("Browsername")
	@Test
	public void TC1(String Browsername) throws InterruptedException {
		WebDriver driver = null;
		
		if(Browsername.equals("chromeDriver")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\raut5\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			 driver = new ChromeDriver();
			
/*		}else if(Browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\raut5\\Downloads\\Firefox Installer.exe");
			 driver = new FirefoxDriver();
			*/
		}else if(Browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Microsoft Edge.lnk");
			 driver = new EdgeDriver();
			
		
		}
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(2000);
		driver.quit();
	}
}
