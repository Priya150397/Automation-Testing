package junitSample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import baseClass.BaseClass;

public class DifferentSites extends BaseClass {

	@Test
	public void tc1() {
	System.out.println("Test Case 1");
	launchUrl("https://www.facebook.com/");
	}
	
	@Before
	public void StartDate() {
	launchBrowser();
	windowMaximize();
	}

	@Test
	public void tc2() {
	System.out.println("Test Case 2");
	launchUrl("https://accounts.google.com/");
    }
	
	@After
	public void EndDate() {
    closeEntireBrowser();
	}

	@BeforeClass
	public static void launchTheBrowser() {
	launchBrowser();
	windowMaximize();
	}

	@AfterClass
	public static void closeThebrowser() {
	closeEntireBrowser();
    }


	@Test
	public void tc5() {
	System.out.println("Test case 5");
     }

	@Test
	public void tc3() {
    System.out.println("Test Case 3");
    launchUrl("https://www.youtube.com/");
	}

	@Test
	public void tc4() {
	System.out.println("Test case 4");
	launchUrl("https://www.lootsell.in/");
    }

}
