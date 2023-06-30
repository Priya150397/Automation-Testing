package testNg;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;


public class PrioritySample extends BaseClass {

	@Test(priority=7)
	private void tc7() {
		//Gmail
	launchUrl("https://mail.google.com/");
	System.out.println("Test Case 7");
     }
	@Test(priority = -13)
	private void tc5() {
		// inameks
		launchUrl("https://www.inmakeslh.in/");
	System.out.println("Test Case 5");
     }
	@Test
	private void tc6() {
	    //redbus
		launchUrl("https://www.redbus.in/");
	System.out.println("Test Case 6");
     }
	@Test(priority = -2)
	private void tc4() {
		//Flipkart	
		launchUrl("https://www.flipkart.com/");	
	System.out.println("Test Case 4");
     }
	@Test(priority = 4)
	private void tc3() {
		launchUrl("https://www.amazon.in/");
	System.out.println("Test Case 3");
     }
	@Test(priority = 8)
	private void tc2() {
		//Facebook
		launchUrl("https://www.facebook.com/");
	System.out.println("Test Case 2");
     }
	@Test(priority = -5)
	private void tc1() {
		//YouTube
		launchUrl("https://www.youtube.com/");
	System.out.println("Test Case 1");
     }
	@BeforeMethod
	private void startdate() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterMethod
	private void enddate() {
	Date d = new Date();
	System.out.println(d);

	}
	@BeforeClass
	private void launchTheBrowse() {
	launchBrowser();
	windowMaximize();
    }
	
	@AfterClass
	private void closeBrowser() {
    closeEntireBrowser();

	}
}
