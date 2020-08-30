package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.SignIn;
import com.nexttech.pageobjectmodel.selectPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class select {
	
	WebDriver driver;
	
	@Given("^user visiting homepage1$")
	public void user_visiting_homepage1() throws Throwable {
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com");  
	}
	catch(Exception e) {
		System.out.println("user couldn't open homepage url");
	}
	}
	
	
	@Given("^click My Account1 button$")
	public void click_My_Account1_button() throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.MyAccount().click();
		WebDriverWait wait =new WebDriverWait(driver, 15);
	}
	catch(Exception e) {
		System.out.println("My account button is not working");
	}
	}
	
	
	@When("^user clicks continue button$")
	public void user_clicks_continue_button() throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.ContinueButton().click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("user couldn't click on continue button");
	}
	}

	
	@When("^user clicks respective Gender$")
	public void user_clicks_respective_Gender() throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.Gender().click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("user couldn't click on gender");
	}
	}

	
	@When("^user enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_enter(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11) throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.Firstname().sendKeys(arg1);
		obj.Lastname().sendKeys(arg2);
		obj.Dateofbirth().sendKeys(arg3);
		obj.Emailaddress().sendKeys(arg4);
		obj.CompanyName().sendKeys(arg5);
		obj.Streetaddress().sendKeys(arg6);
		obj.Suburb().sendKeys(arg7);
		obj.Postcode().sendKeys(arg8);
		obj.City().sendKeys(arg9);
		obj.StateProvince().sendKeys(arg10);
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("user couldn't enter valid data");
	}
	}

	
	@When("^user selects Country$")
	public void user_selects_Country() throws Throwable {
	try {   
		WebElement country_dropdown=driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[4]/table/tbody/tr[6]/td[2]/select"));
		Select Country_dd=new Select(country_dropdown);
		Country_dd.selectByIndex(5);
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("user couldn't select Country");
	}
	}
	
	
	@When("^user enter \"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_enter(String arg1, String arg2) throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.Telephonenumber().sendKeys(arg1);
		obj.Faxnumber().sendKeys(arg2);
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("User couldn't type password and confirm");
	}
	}

	
	@When("^user click on Newsletter$")
	public void user_click_on_Newsletter() throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.Newsletter().click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("user couldn't click on newsletter");
	}
	}

	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.Password().sendKeys(arg1);
		obj.PasswordConfirmation().sendKeys(arg2);
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("user couldn't enter password and confirm");
	}
	}
	
	
	@When("^user click on Continue$")
	public void user_click_on_Continue() throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.FinalContinue().click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("user couldn't click on final continue");
	}
	}

	
	@Then("^user successfully signs up on Oscommerce$")
	public void user_successfully_signs_up_on_Oscommerce() throws Throwable {
	try {
		selectPOM obj=new selectPOM(driver);
		obj.AccountSuccess().click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("user couldn't successfully create an account");
	}
	}
	
	
}