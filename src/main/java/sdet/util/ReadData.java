package sdet.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static String[][] getData() throws IOException {
		FileInputStream file = new FileInputStream("D:\\selenium\\testdata\\testData3.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("EmpData");
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String data[][]=new String[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0; j<colCount; j++) {
			 data[i][j] = sheet.getRow(i).getCell(j).toString();
				
				
			}
			System.out.println();
		}
		
         return data;
	}

}
