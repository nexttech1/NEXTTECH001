package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.ContactUs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactus {
	WebDriver driver;

	@Given("^user visits homepage$")
	public void user_visits_homepage() throws Throwable {
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		// (key) -> "driver name", (value) -> "path of driver"
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com");
	}
	catch (Exception e) {
		System.out.println("homepage not opening");
	}
	}
	

	@Given("^click Contact Us button$")
	public void click_Contact_Us_button() throws Throwable {
	try {
		ContactUs obj1=new ContactUs(driver);
		obj1.ContactUs().click();
	}
	catch (Exception e) {
		System.out.println("Contact Us button not working");
	}	
	}
	
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String arg1, String arg2, String arg3) throws Throwable {
	try {
		ContactUs obj1=new ContactUs(driver);
		obj1.FullName().sendKeys(arg1);
		obj1.EmailAddress().sendKeys(arg2);
		obj1.Enquiry().sendKeys(arg3);
	}
	catch (Exception e) {
		System.out.println("invalid name and email and enquiry");
	}
	}

	
	@When("^user click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
	try {
		ContactUs obj1=new ContactUs(driver);
		obj1.Continue().click();
	}
	catch (Exception e) {
		System.out.println("Continue button not working");
	}
	}

	
	@Then("^user successfully submit message to oscommerce$")
	public void user_successfully_submit_message_to_oscommerce() throws Throwable {
	try {
		ContactUs obj1=new ContactUs(driver);
		obj1.ContactSuccess().click();
	}
	catch (Exception e) {
		System.out.println("Message not successfully submitted");
	}
	}
	
}
