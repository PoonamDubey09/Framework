package com.learnAutomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		
		
		File src= new File("./TestData/Data.xlsx");
		
		
			FileInputStream fis;
			try {
				fis = new FileInputStream(src);
			
			 wb= new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Enable to read excel file:"+e.getMessage());
		}
		
		
	}
	
	public String getStringData(String sheetname, int row, int cloumn) {
		return wb.getSheet(sheetname).getRow(row).getCell(cloumn).getStringCellValue();
		
		
		
	}
	
	public String getIntegerData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		
		
	}
	
}
