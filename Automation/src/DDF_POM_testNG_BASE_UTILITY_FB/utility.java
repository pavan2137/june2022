package DDF_POM_testNG_BASE_UTILITY_FB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	
	public static String getproperties(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream file1 = new FileInputStream("C:\\Users\\raut5\\eclipse-workspace\\Automation\\URL.properties");
		 obj.load(file1);
		 String value = obj.getProperty(key);
		return value;
		
	}

	public static String getTestData (int rowindex , int cellindex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\ExalSheet1\\Automation.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Facebook");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
		
	}
	public static void getscreenshort(WebDriver driver, int testID) throws IOException {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("D:\\Screen Short\\facebook"+testID+".png");
		FileHandler.copy(scr, dest);
		
		
	}
}
