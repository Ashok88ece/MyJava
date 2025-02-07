package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream inputStream = new FileInputStream("C:\\Users\\x230\\Desktop\\WorkBook.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet sheet = workbook.getSheet("WorkBook");
		
		int rowcount = sheet.getLastRowNum();
		
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++) {
			
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int j=0;j<colcount;j++) {
				
				String value = currentrow.getCell(j).toString();
				System.out.print("   "   +value);
			}
			
			System.out.println();
		}
		

	}

}
