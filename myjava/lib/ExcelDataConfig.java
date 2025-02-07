package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	
	XSSFSheet data;
	
	
public ExcelDataConfig (String excelpath) throws Exception {
	
	try {
		File src = new File(excelpath);
		
		FileInputStream file = new FileInputStream(src);
		
		 wb = new XSSFWorkbook(file);
		
		 data = wb.getSheetAt(0);
	} 
	catch (Exception e) {
		
		System.out.println(e.getMessage());
		
	}
		
	
}

public String getData(int sheetNumber,int row,int column) 
{
	data = wb.getSheetAt(sheetNumber);
	String data1 = data.getRow(row).getCell(column).getStringCellValue();
	return data1;
}
}
