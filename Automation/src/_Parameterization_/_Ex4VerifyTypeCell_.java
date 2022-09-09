package _Parameterization_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _Ex4VerifyTypeCell_ {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\ExalSheet1\\Automation.xlsx");
		
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		CellType celltype = sheet1.getRow(1).getCell(2).getCellType();
		
		System.out.println(celltype); // NUMERIC
	}
}
