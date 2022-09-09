package _Parameterization_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _Ex3PrintCell_ {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\ExalSheet1\\Automation.xlsx");
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet3");

		int lastrow = sheet1.getLastRowNum();

		for (int i = 0; i <= lastrow; i++) {
			double data = sheet1.getRow(i).getCell(0).getNumericCellValue();
			System.out.println(data);

		}
	}
}
