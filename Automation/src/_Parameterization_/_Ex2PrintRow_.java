package _Parameterization_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _Ex2PrintRow_ {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\ExalSheet1\\Automation.xlsx");

		Sheet data1 = WorkbookFactory.create(file).getSheet("Sheet2");

		short cellsize = data1.getRow(0).getLastCellNum();

		for (int i = 0; i <= cellsize - 1; i++) {
			String data = data1.getRow(0).getCell(i).getStringCellValue();
			System.out.println(data);
		}
	}
}
