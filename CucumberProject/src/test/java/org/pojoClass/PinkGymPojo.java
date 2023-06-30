package org.pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class PinkGymPojo  extends BaseClass {
	
	public WebElement getName() {
		return name;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getOffer() {
		return offer;
	}

	public PinkGymPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "name")
	private WebElement name;
	
	@FindBy(className = "form-control")
	private WebElement phoneNo;
	
	@FindBy(name = "singlebutton")
	private WebElement offer;
	
	
	

}
