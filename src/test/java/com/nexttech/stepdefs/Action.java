package com.nexttech.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	
	WebDriver driver; //since i mentioned WebDriver here, I dont need to mention it in beginning of line 16
	@Test
	public void clickdropdown() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  //implicit wait
		  driver.get("http://mrbool.com/");
		  
		  Actions act=new Actions(driver); // creating object 
		  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"))).build().perform();
		  driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")).click();
		Thread.sleep(4000);
		
		  
	}
}
