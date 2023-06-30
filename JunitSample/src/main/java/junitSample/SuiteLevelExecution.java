package junitSample;

import java.awt.Window;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import baseClass.BaseClass;

public class SuiteLevelExecution extends BaseClass {
	
	
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://www.facebook.com/");
		
	}
	
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		launchUrl("https://www.snapdeal.com/");
	}
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
	}
	@Test
	public void tc4() {
		System.out.println("Test Case 4");
	}
	
   @Before
   public void startdate() {
	 Date d = new  Date();
	 System.out.println(d);
   }
   @After
  public void enddate() {
	   Date d = new  Date();
	System.out.println(d);
   }
   
   @BeforeClass
  public static void launchTheBrowser() {
   launchBrowser();
   }
   @AfterClass
   public static void closeTheBrowser () {
	  closeEntireBrowser();
   }
}
