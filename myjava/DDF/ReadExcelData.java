package DDF;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\x230\\Desktop\\test.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));

	}

}
