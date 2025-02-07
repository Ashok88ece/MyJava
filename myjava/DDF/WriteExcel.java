 package DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\Users\\x230\\Desktop\\test.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		//sheet1.getRow(0).createCell(2).setCellValue("Pass");
		
		//sheet1.getRow(0).createCell(3).setCellValue("Pass");
		
		//FileOutputStream fout = new FileOutputStream(src);
		
		//wb.write(fout);
  
		
		//wb.close(); 

	}

}
