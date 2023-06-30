package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SeleniumExcel {

	public static void main(String[] args) throws IOException  {
		
		File f = new File("C:\\Users\\SM Computer\\Desktop\\Eclipse\\Excel\\Excel\\ReadData3.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet mySheet = wb.getSheet("read");
		
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			
	         Row iterateRow = mySheet.getRow(i);
	         
	     for (int j = 0; j < iterateRow.getPhysicalNumberOfCells(); j++) {
	    	 
	    	 Cell iterateCell = iterateRow.getCell(j);
			System.out.println(iterateCell);
        
       /* for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
        	Row r = mySheet.getRow(i);
        	
        for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
        	Cell c = r.getCell(j);
        	int cellType = c.getCellType();
        	
        	
       if (cellType == 1) {
    	   String Value = c.getStringCellValue();
    	   System.out.println(Value);
		
	} 	
       else if (DateUtil.isCellDateFormatted(c)) {
    	   Date dd = c.getDateCellValue();
    	   SimpleDateFormat s = new SimpleDateFormat("DD-MM-YYYY");
    	   String value = s.format(dd);
    	   System.out.println(value);*/
    	   }
      /* else {
		double d = c.getNumericCellValue();
		long l = (long) d;
		String value = String.valueOf(l);
		System.out.println(value);*/
	}
			
		}
			
		
        
        
	}


