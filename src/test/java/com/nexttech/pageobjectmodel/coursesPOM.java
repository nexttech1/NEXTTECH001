package com.nexttech.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coursesPOM {
	WebDriver driver;
	
	public coursesPOM (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	//Content
	@FindBy(xpath="//*[@class=\"menulink\"]")
	WebElement hover_Content;
	
	public WebElement Content() {
		return hover_Content;	
	}
	
	
	//Courses
	@FindBy(xpath="//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")
	WebElement click_Courses;
	
	public WebElement Courses() {
		return click_Courses;
		
	}	  
	
	
	//Courses Validation
	@FindBy(xpath="//*[@id=\"curso-nav\"]")
	WebElement click_CoursesSuccess;
	
	public WebElement CoursesSuccess() {
		return click_CoursesSuccess;	
	}

			
	

	
		
	}
	
	
	
	

	
	
