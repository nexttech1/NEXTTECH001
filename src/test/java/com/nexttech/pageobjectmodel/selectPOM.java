package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectPOM {
	
	WebDriver driver;
	
	public selectPOM (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//My Account - Click
	@FindBy(xpath="//*[@id=\"tdb3\"]/span[2]")
	WebElement click_MyAccount;
	
	public WebElement MyAccount() {
		return click_MyAccount;
	}
	
	
	//Continue Button - Click
	@FindBy(xpath="//*[@id=\"tdb2\"]/span[2]")
	WebElement click_ContinueButton;
	
	public WebElement ContinueButton() {
		return click_ContinueButton;	
	}
	
	
	//Gender - Click
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")
	WebElement click_Gender;
	
	public WebElement Gender() {
		return click_Gender;
	}
	
	
	//First Name - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[2]/td[2]/input")
	WebElement type_Firstname;
	
	public WebElement Firstname() {
		return type_Firstname;
	}
	
	
	//Last Name - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[3]/td[2]/input")
	WebElement type_Lastname;
	
	public WebElement Lastname() {
		return type_Lastname;
	}
	
	
	//Date of Birth - Type
	@FindBy(xpath="//*[@id=\"dob\"]")
	WebElement type_Dateofbirth;
	
	public WebElement Dateofbirth() {
		return type_Dateofbirth;
	}
	
	
	//E-Mail Address - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[5]/td[2]/input")
	WebElement type_Emailaddress;
	
	public WebElement Emailaddress() {
		return type_Emailaddress;
	}
	
	
	//Company Name - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[3]/table/tbody/tr/td[2]/input")
	WebElement type_CompanyName;
	
	public WebElement CompanyName() {
		return type_CompanyName;
	}

	
	//Street Address - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[4]/table/tbody/tr[1]/td[2]/input")
	WebElement type_Streetaddress;
	
	public WebElement Streetaddress() {
		return type_Streetaddress;
	}
	
	
	//Suburb - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[4]/table/tbody/tr[2]/td[2]/input")
	WebElement type_Suburb;
	
	public WebElement Suburb() {
		return type_Suburb;
	}
	
	
	//Post Code - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[4]/table/tbody/tr[3]/td[2]/input")
	WebElement type_Postcode;
	
	public WebElement Postcode() {
		return type_Postcode;
	}
	
	
	//City - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[4]/table/tbody/tr[4]/td[2]/input")
	WebElement type_City;
	
	public WebElement City() {
		return type_City;
	}
	
	
	//StateProvince - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[4]/table/tbody/tr[5]/td[2]/input")
	WebElement type_StateProvince;
	
	public WebElement StateProvince() {
		return type_StateProvince;
	}
	
	
	//Country - Select
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[4]/table/tbody/tr[6]/td[2]/select")
	WebElement select_Country;
	
	public WebElement Country() {
		return select_Country;
	}
	
	
	//Telephone Number - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[5]/table/tbody/tr[1]/td[2]/input")
	WebElement type_Telephonenumber;
	
	public WebElement Telephonenumber() {
		return type_Telephonenumber;	
	}
	
	
	//Fax Number - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[5]/table/tbody/tr[2]/td[2]/input")
	WebElement type_Faxnumber;
	
	public WebElement Faxnumber() {
		return type_Faxnumber;
	}
	
	
	//Newsletter - Click
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[5]/table/tbody/tr[3]/td[2]/input")
	WebElement click_Newsletter;
	
	public WebElement Newsletter() {
		return click_Newsletter;
	}
	
	
	//Password - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[6]/table/tbody/tr[1]/td[2]/input")
	WebElement type_Password;
	
	public WebElement Password() {
		return type_Password;
	}
	
	
	//Password Confirmation - Type
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[6]/table/tbody/tr[2]/td[2]/input")
	WebElement type_PasswordConfirmation;
	
	public WebElement PasswordConfirmation() {
		return type_PasswordConfirmation;
	}
	
	
	//Final Continue - Click
	@FindBy(xpath="//*[@id=\"tdb4\"]/span[2]")
	WebElement click_FinalContinue;
	
	public WebElement FinalContinue() {
		return click_FinalContinue;
	}
	
	
	//Account Success - Click
	@FindBy(xpath="//*[@id=\"bodyContent\"]/h1")
	WebElement click_AccountSuccess;
	
	public WebElement AccountSuccess() {
		return click_AccountSuccess;	
	}
	
}
