package junitSample;

import org.junit.Test;

import baseClass.BaseClass;

public class Asset  extends BaseClass {

	
@Test
public void tc1() {
	System.out.println("Test Case 1");
	launchUrl("https://www.facebook.com/");
	String Title = pageTitle();
	String Url = pageUrl();
	//FacebookLogin f = new FacebookLogin();
	//passText("priya@gmail.com",ge)
}

	
	
}



