package testNg;
import java.util.Date;
import org.sam.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNgSamples extends BaseClass {
	
	@Test
	private void tc1() {
		launchUrl("https://www.facebook.com/");
		//WebElement email = driver.findElement(By.id("email"));
		//passText("Priya@gmail.com", email);
		
		//WebElement password = driver.findElement(By.name("pass"));
		//passText("Priya", password);
		FbLoginPojo f = new FbLoginPojo();
		passText("Priya@gmail.com",f.getEmail());
		System.out.println(f.getEmail());
		passText("Priya",f.getPassword());
		System.out.println(f.getPassword());
		System.out.println("Test case 1");
	}
	/*@Test
	private void tc3() {
	launchUrl("https://www.flipkart.com/");
	System.out.println("Test case 3");
	
	}
	@Test
	private void tc2() {
	launchUrl("https://www.instagram.com/");
	System.out.println("Test case 2");
	} */
	
	@BeforeMethod
	private void startDate() {
	 Date d = new Date();
     System.out.println(d);
	}
	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@BeforeClass
	private void launchTheBrowser() {
	launchBrowser();
	windowMaximize();

	}
	
	@AfterClass
	private void closeBrowser() {
	System.out.println("Close The Browser");

	}
}
