package _Parameterization_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _Ex1GetStringData_ { //for EXCEL
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream file = new FileInputStream("D:\\ExalSheet1\\Automation.xlsx");
		
 /* 	String data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    System.out.println(data1);    //pavan raut
		
		double data2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue();
	System.out.println(data2);      //421256
		
		boolean data3 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(0).getBooleanCellValue();
	System.out.println(data3);  //true    
		
		//1. getLastCellNum()
		int data4 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	System.out.println(data4);  //3      */
		
		//2. getLastRowNum()
	int data5 = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(data5);  //4
	}
}
