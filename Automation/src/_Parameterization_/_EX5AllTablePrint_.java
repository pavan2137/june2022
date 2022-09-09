package _Parameterization_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _EX5AllTablePrint_ {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("D:\\ExalSheet1\\Automation.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	
	for(int i=0; i<=sh.getLastRowNum(); i++) {
		for(int j=0; j<=sh.getRow(i).getLastCellNum()-1; j++) {
		Cell info = sh.getRow(i).getCell(j);
		CellType ct = info.getCellType();
		
		if(ct== info.getCellType().STRING) {
			System.out.print(info.getStringCellValue()+"  ");
		}else if(ct== info.getCellType().NUMERIC){
			System.out.print(info.getNumericCellValue()+"  ");
			
		}else if(ct==info.getCellType().BOOLEAN) {
			System.out.print(info.getBooleanCellValue()+"  ");
		}
		
		}
		System.out.println();
	}
}
}
