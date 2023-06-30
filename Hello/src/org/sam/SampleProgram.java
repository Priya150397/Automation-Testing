package org.sam;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SampleProgram {
    public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Eclipse\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.manage().window().maximize();
    	
	}
}
