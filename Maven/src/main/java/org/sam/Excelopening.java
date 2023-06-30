package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelopening {
	public static void main(String[] args) throws IOException {
		// 1. mention the excel path
        File f = new File("C:\\Users\\SM Computer\\Desktop\\Eclipse\\Excel\\Excel\\Infomation.xlsx");

		// 2. To read the excel file
		FileInputStream fis = new FileInputStream(f);

		// 3. To upcasting the workbook and read .xlsx file format
		XSSFWorkbook WB = new XSSFWorkbook(fis);
		
		//4. Get sheet from workbook
		XSSFSheet mySheet = WB.getSheet("Details");
		
		//5. Get row from sheet
		XSSFRow particularRow = mySheet.getRow(1);
		
		
		//6.get cell from row
		XSSFCell cell = particularRow.getCell(0);
		System.out.println(cell);

	}

}
