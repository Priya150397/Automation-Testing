package org.pojo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  FbLoginPojo {
    //https://www.flipkart.com/
	
	
	//1.Non parameterized constructor

	public FbLoginPojo() {
		
	}
	//2.Private WebElement find
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	
	//3.Getters to access WebElemnt outside the clas

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
