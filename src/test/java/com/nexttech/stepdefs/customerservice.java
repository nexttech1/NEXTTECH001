package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customerservice {
	
	WebDriver driver; 
	
	@Given("^user visit homepage$")
	public void user_visit_homepage() throws Throwable {
		//Interview Q: how to open browser? Line 17-19
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		// (key) -> "driver name", (value) -> "path of driver"
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
	    
	}

	@When("^user click on customer service tab$")
	public void user_click_on_customer_service_tab() throws Throwable {
	    
	}

	@When("^user click on Digital service & device support$")
	public void user_click_on_Digital_service_device_support() throws Throwable {
	   
	}

	@Then("^user should redirect to Digital service & device support page$")
	public void user_should_redirect_to_Digital_service_device_support_page() throws Throwable {
	   
	}
}
