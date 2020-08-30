package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.ContactUs;
import com.nexttech.pageobjectmodel.coursesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class courses {
	
	WebDriver driver;
	
	@Given("^user opens homepage$")
	public void user_opens_homepage() throws Throwable {
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://mrbool.com");	
		WebDriverWait wait=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("homepage didn't open");
	}
	}
	

	@When("^user redirects to content menu and user clicks on Courses Feature$")
	public void user_redirects_to_content_menu_and_user_clicks_on_Courses_Feature() throws Throwable {
	try {
		coursesPOM obj=new coursesPOM(driver);
		Actions act=new Actions(driver);
		 act.moveToElement(obj.Content()).build().perform();
		 obj.Courses().click();
		 WebDriverWait wait1=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("dropdown didn't work");
	}
	}
	
	
	@Then("^user should successfully redirect to the Courses page$")
	public void user_should_successfully_redirect_to_the_Courses_page() throws Throwable {
	try {
		coursesPOM obj=new coursesPOM(driver);
		obj.CoursesSuccess().click(); 
		WebDriverWait wait2=new WebDriverWait(driver, 15);
	}
	catch (Exception e) {
		System.out.println("didn't redirect to courses page");
	}
	}
	
}
