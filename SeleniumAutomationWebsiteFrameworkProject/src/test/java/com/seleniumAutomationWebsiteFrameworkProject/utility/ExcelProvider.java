package com.seleniumAutomationWebsiteFrameworkProject.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProvider {
	
	XSSFWorkbook wb;
	public ExcelProvider()
	{
		File src= new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Not able to access excel file "+e.getMessage());
		}  
	}
	
	public String getStringData(int sheetIndex,int row,int column)
	{
		
	return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
	}
	public String getStringData(String sheetName,int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	public double getNumericData(String sheetName,int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		
	}

}
