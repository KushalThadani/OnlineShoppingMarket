/**
 * 
 */
package com.utility;

import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Kushal Thadani
 *
 */
public class ExcelDataReaderFile {
	
	static Workbook book;
	Sheet sheet;
	static FileInputStream  file = null;
	public static String TESTDATA_EXCEL_SHEET_PATH="E:\\project_diploy_on_git\\eCommerceApplication\\testData\\testData.xlsx";
	
	public static Object[][] excelDataReaderMethod(String sheetName) throws Exception{
		try {
			file = new FileInputStream(TESTDATA_EXCEL_SHEET_PATH);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
			
		}catch(InvalidFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Sheet sheet;sheet =(Sheet) book.getSheet(sheetName);
		Object[][]  data = new Object[((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum()][((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getLastCellNum()];
		return data;
	}
}
