package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static  WebDriver driver; 
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
		
   public static void launchUrl(String Url) {
	   driver.get(Url);
   }
   public static String pageTitle() {
	   String title = driver.getTitle();
	   return title;
   }
   public static String pageUrl() {
	   String Url = driver.getCurrentUrl();
	   return Url;
   }
   public static void passText(String txt , WebElement ele ) {
	   ele.sendKeys(txt);
}
   public static void closeEntireBrowser() {
	   driver.quit();
   }

public static void clickBtn(WebElement ele) {
	ele.click();
}

public static void Screenshot(String imgName) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File img = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("location + imgName.png");
	FileUtils.copyFile(img, f);
	
}
public static Actions a;

public static void moveTheCursor(WebElement targetWebElement) {
	a = new Actions(driver);
	a.moveToElement(targetWebElement).perform();
}

public static void dragAndDrop(WebElement dropElement) {
	a = new Actions(driver);
	a.dragAndDrop(dropElement, dropElement).perform();
	
}
public static  JavascriptExecutor js;

public static void ScrollThePage(WebElement targetWebElement) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arugument[0].ScrollIntoView(True),element");
}
public static void Scroll(WebElement element) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arugument[0].ScrollIntoView(False),element"); 
}

public static void excelRead(String Sheetname, int rowNum, int CellNum) throws IOException   {
	File f = new File("excel location.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheet("Data");
	Row r = s.getRow(rowNum);
	Cell c = r.getCell(CellNum);
	int cellType = c.getCellType();
	String value = "";
	if (cellType==1) {
		String value2 = c.getStringCellValue();
}
	else if (DateUtil.isCellDateFormatted(c)) {
		Date dd = c.getDateCellValue();
		SimpleDateFormat s1 = new SimpleDateFormat(value);
		String value1 = s1.format(dd);
		
	} else {
		double d = c.getNumericCellValue();
		long l = (long) d;
		String valueOf = String.valueOf(l);
	}
}
		
	public static void createExcelFile(int rowNum, int cellNum, String newData) throws IOException {
	File f = new File("C:\\Users\\SM Computer\\Desktop\\Eclipse\\Maven\\Excel\\Maven.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet newSheet = w.createSheet("Details");
	Row r = newSheet.createRow(rowNum);
	Cell createCell = r.createCell(cellNum);
	createCell.setCellValue(newData);
	FileOutputStream fos = new FileOutputStream(f);
	w.write(fos);
	}
	
	    public static void createRow(int creRow,int creCell,String newData)throws IOException  {
		File f = new File("C:\\Users\\SM Computer\\Desktop\\Eclipse\\Maven\\Excel\\Maven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet n = w.getSheet("Details");
		Row r = n.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	    }
		public static void createCell(int rowNum, int CellNum, String newData) throws IOException {
		
			File f = new File("C:\\Users\\SM Computer\\Desktop\\Eclipse\\Maven\\Excel\\Maven.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet newSheet = w.getSheet("Details");
			Row creaRow = newSheet.getRow(rowNum);
			Cell c = creaRow.createCell(CellNum);
			c.setCellValue(newData);
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
		}
		
		public static void updateDataToParticularCell(int getTheRow, int getTheCell, String newData) throws IOException {
		
			File f = new File("Excel Loaction.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet newSheet = w.createSheet("Data");
			Row creaRow = newSheet.getRow(0);
			Cell createCell = creaRow.getCell(3);
			createCell.getStringCellValue();
			if (createCell.equals("Data")) {
				createCell.setCellValue("manual");
				
			}
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
	
	
		
	}
		

	
}













