package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	WebDriver driver;
	
	public SignIn (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	/*Constructor is not a method, but a special type of method
	  1. Constructor name and class name will be the same
	  2. There is no return type
	*/
	
	@FindBy(xpath="//*[@id=\"tdb3\"]/span[2]") 
	WebElement click_MyAccount;
	
	public WebElement MyAccount() {
		return click_MyAccount;
		
	}
	
	@FindBy(name="email_address")
	WebElement type_EmailAddress;
	
	public WebElement EmailAddress() {
		return type_EmailAddress;

	}
	
	@FindBy(name="password")
	WebElement type_Password;
	
	public WebElement Password() {
		return type_Password;
	}
	
	@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
	WebElement click_SignIn;
	
	public WebElement SignIn() {
		return click_SignIn;
	}
	
	@FindBy(xpath="//*[@id=\"bodyContent\"]/h1")
	WebElement click_MyAccountInformation;
	
	public WebElement MyAccountInformation() {
		return click_MyAccountInformation;
	}
	
	@FindBy(xpath="//*[@id=\"tdb4\"]/span")
	WebElement click_LogOff;
	
	public WebElement LogOff() {
		return click_LogOff;
		
	}


	
}
