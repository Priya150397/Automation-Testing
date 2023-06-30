package org.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Sample extends BaseClass {

	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		windowMaximize();
		
		WebElement email = driver.findElement(By.id("email"));
		passText("Priya", email);
		
		WebElement password = driver.findElement(By.name("pass"));
		passText("Priya", password);

	}

}
