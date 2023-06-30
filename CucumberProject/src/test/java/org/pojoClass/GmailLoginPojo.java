package org.pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class GmailLoginPojo extends BaseClass {

//1.Non parameterized constructor
		public GmailLoginPojo() {
			PageFactory.initElements(driver, this);
		}
		//2.Private WebElement find
		@FindBy(name = "identifier")
		private WebElement email;
		
		@FindBy(xpath="//span[text()='Next']")
		private WebElement nxtBtn;
		
		@FindBy(name="Passwd")
		private WebElement password;

		public WebElement getEmail() {
			return email;
		}

		public WebElement getNxtBtn() {
			return nxtBtn;
		}

		public WebElement getPassword() {
			return password;
		}
		
		
		

		
		
		
		
		
		/* driver.navigate().refresh();
		//passText("Priya",g.getEmail());
		//passText("Achu", g.getPassword());
		*/
		
				
	}


	

	


