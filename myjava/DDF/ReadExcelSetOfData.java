package DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSetOfData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\Users\\x230\\Desktop\\test.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total Number of Rows:"+rowcount);
		
		for(int i=0;i<rowcount;i++) {
			
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data From Excel Sheet:"+data);
			
			System.out.println("*******************************");
			
		}

	}

}
