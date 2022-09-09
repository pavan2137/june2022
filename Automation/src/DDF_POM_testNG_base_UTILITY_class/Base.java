package DDF_POM_testNG_base_UTILITY_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	static WebDriver driver;
	public static void Browseropen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raut5\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable notification "); // use for handle notification
		driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(Utility.geturlproperti("URL"));

	}
}
