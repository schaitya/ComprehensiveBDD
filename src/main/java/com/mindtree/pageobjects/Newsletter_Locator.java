package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Newsletter_Locator {

	public WebDriver driver;
	public ExtentTest test;

	public Newsletter_Locator(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='Email']")
	WebElement newsletter;
	
	@FindBy(id="subscribe")
	WebElement submitbutton;

	public WebElement Newsletter() {
		return newsletter;
	}
	
	public WebElement Submit_newsletter() {
		return submitbutton;
	}
}
