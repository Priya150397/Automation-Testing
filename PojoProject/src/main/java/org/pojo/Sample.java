package org.pojo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class Sample extends BaseClass {

	//1.Non parameterized constructor
		
		public void GmailLoginPojo() {
			PageFactory.initElements(driver,this);
			
		}
		//2.Private WebElement find
		@FindBy(id="identifierId")
		private WebElement email;
		
		@FindBy(name="Passwd")
		private WebElement password;
		
		@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[1]")
        private WebElement login;
		
		//3.Getters to access WebElemnt outside the class

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}

			/*WebElement email = driver.findElement(By.id("email"));
		passText("Priya", email);
		
		WebElement password = driver.findElement(By.name("pass"));
		passText("Priya", password);
		
	//To refresh page
		driver.navigate().refresh();
		passText("Priya@gmail.com",email);
		passText("Priya2150397", password);*/

	}

