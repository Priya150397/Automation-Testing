package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteAndReadExcel extends BaseClass {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\SM Computer\\Desktop\\Eclipse\\Excel\\Excel\\WriteandRead.xlsx");
		
		if (!f.exists()) {
			f.createNewFile();
		}
		Workbook wb = new XSSFWorkbook();

		Sheet s = wb.createSheet("WorkBook");

		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("1.Selenium");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

}
