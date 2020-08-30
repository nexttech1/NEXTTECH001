package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	WebDriver driver;
	
	public ContactUs (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		//PageFactory.initElements(driver, object) always
		
	}
	
		@FindBy(xpath="//*[@id=\"columnLeft\"]/div[5]/div[2]/a[4]")
		WebElement click_ContactUs;
		
		public WebElement ContactUs () {
			return click_ContactUs;
		}
		
		
		@FindBy(name="name")
		WebElement type_FullName;
		
		public WebElement FullName () {
			return type_FullName;
		}
		
		
		@FindBy(name="email")
		WebElement type_EmailAddress;
		
		public WebElement EmailAddress () {
			return type_EmailAddress;
		}
		
		
		@FindBy(name="enquiry")
		WebElement type_Enquiry;
		
		public WebElement Enquiry () {
			return type_Enquiry;
		}
		
		
		@FindBy(xpath="//*[@id=\"tdb4\"]/span[2]")
		WebElement click_Continue;
		
		public WebElement Continue () {
			return click_Continue;	
		}
		
		
		@FindBy(xpath="//div[@class=\"contentText\"]")
		WebElement click_ContactSuccess;
		
		public WebElement ContactSuccess () {
			return click_ContactSuccess;
		}
		
}





