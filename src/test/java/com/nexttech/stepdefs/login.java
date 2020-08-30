package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.SignIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;

	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
	try {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		// (key) -> "driver name", (value) -> "path of driver"
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.oscommerce.com");  
	}
	catch(Exception e) {
		System.out.println("browser or url not opening");
	}
	}
	
	
	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
	try {
		SignIn obj1=new SignIn(driver);
		obj1.MyAccount().click();   
		//Thread.sleep(4000); //this is hard wait of 4 seconds
		WebDriverWait wait =new WebDriverWait(driver, 30);
	}
	catch(Exception e) {
		System.out.println("Account button is not working");
	}
	}
	
	
	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
	try {
	
		SignIn obj1=new SignIn(driver);
		obj1.EmailAddress().sendKeys(arg1);
		obj1.Password().sendKeys(arg2);
		WebDriverWait wait =new WebDriverWait(driver, 30);
	}
	catch(Exception e) {
		System.out.println("Email and password are not working");
	}
	}
	
	
	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
	try {	

		SignIn obj1=new SignIn(driver);
		obj1.SignIn().click();
		WebDriverWait wait =new WebDriverWait(driver, 30);
	}
	catch(Exception e) {
		System.out.println("Sign in button is not working");
	}
	}
	
	
	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
	try {
	   SignIn obj1=new SignIn(driver);
	   obj1.MyAccountInformation().click();
	   WebDriverWait wait =new WebDriverWait(driver, 30);
	}
	catch (Exception e) {
		System.out.println("login was not successful");
	}
	}
	
	
	@Then("^user click on Log off Button for logout$")
	public void user_click_on_Log_off_Button_for_logout() throws Throwable {
	try {
	
		SignIn obj1=new SignIn(driver);
		obj1.LogOff().click(); 
		WebDriverWait wait =new WebDriverWait(driver, 30);
	}
	catch (Exception e) {
		System.out.println("log off button is not working");
	}
	}
	

	//@sc2
	@When("^user enter invalid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_enter_invalid_and_valid(String arg1, String arg2) throws Throwable {
	try {
		SignIn obj1=new SignIn(driver);
		obj1.EmailAddress().sendKeys(arg1);
		obj1.Password().sendKeys(arg2);
		WebDriverWait wait =new WebDriverWait(driver, 30);
	}	
	catch (Exception e) {
		System.out.println("shouldnt log in successfully");
	}
	}
	
	
	
}
