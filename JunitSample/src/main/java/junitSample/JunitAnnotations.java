package junitSample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotations {

	@Test
	public void tc8() {
	System.out.println("Test Case 8");
	}
	@Test
	public void tc2() {
	System.out.println("Test Case 2");
	}
	
	@Before
	public void startdate() {
		System.out.println("Start Date and Time");
	}
	@Test
	public void tc6() {
    System.out.println("Test Case 6");
	}
	@Test
	public void tc5() {
	System.out.println("Test Case 5");
	}
	@After
	public void EndDate() {
		System.out.println("End Date and Time");
	}
	
	
	@Test
	public void tc1() {
	System.out.println("Test Case 1");
	}
	@Test
	public void tc9() {
	System.out.println("Test Case 9");
	}
	
	
	
	@BeforeClass
	public static void BrowserLaunch() {
		System.out.println("Browser Launch.....");
	}
	@Test
	public void tc3() {
	System.out.println("Test Case 3");
	}
	
	
	@AfterClass
	public static void CloseBowser() {
		System.out.println("Close The Browser.....");
	}
	@Test
	public void tc7() {
	System.out.println("Test Case 7");
	}
	@Test
	public void tc4() {
	System.out.println("Test Case 4");

	}

}
