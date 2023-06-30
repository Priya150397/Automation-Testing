package testNg;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class  FbLoginPojo extends BaseClass {
  
	
	//1.Non parameterized constructor

	public FbLoginPojo(){
		PageFactory.initElements(driver, this);
	}
	
	
	//2.Private WebElement find
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(name="login")
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
	

}
