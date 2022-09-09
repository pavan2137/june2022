package DDF_POM_testNG_BASE_UTILITY_FB;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	static WebDriver driver;
	public static void browseropen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
//C:\Users\raut5\eclipse-workspace\SELENIUM_MAVEN\Browser\chromedriver.exe 
		//copy exe file into browser file
		
		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get(utility.getproperties("url"));
		
		
		
	}

	
}
