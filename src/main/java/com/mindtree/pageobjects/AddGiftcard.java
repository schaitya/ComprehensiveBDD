package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class AddGiftcard{

	public WebDriver driver;
	public ExtentTest test;	

	public AddGiftcard(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='https://www.bigsmall.in/products/gift-card']")
	WebElement gift_card;
	@FindBy(xpath="//button[@name='add']")
	WebElement add;
	@FindBy(xpath="//span[contains(text(),'Go To Checkout')]")
	WebElement checkout;


	public WebElement Gift_card_section() {
		return gift_card;
	}
	public WebElement Add_cart() {
		return add;
	}
	public WebElement checkout_availibility() {
		return checkout;
	}
}
