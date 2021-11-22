package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Cart_Checkout {

	public WebDriver driver;
	public ExtentTest test;

	public Cart_Checkout(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//div[contains(text(),'Lord Shiva Adiyogi Figurine')]")
	WebElement product;
	@FindBy(xpath="//button[@name='add']")
	WebElement add;
	@FindBy(xpath="	//a[@href='javascript:void(0);']")
	WebElement continue_shopping;
	@FindBy(xpath="//img[@class='carticonimage']")
	WebElement cart;
	@FindBy(xpath="//span[contains(text(),'Go To Checkout')]")
	WebElement checkout;
	@FindBy(xpath="	//img[@class='wa-optin-widget-close-img']")
	WebElement remove_whatsapp;
	@FindBy(xpath="//button[@id='continue_button']")
	WebElement continuebutton;


	public WebElement product_selection() {
		return product;
	}
	public WebElement Add_cart() {
		return add;
	}
	public WebElement Continue_shop() {
		return continue_shopping;
	}
	public WebElement Cart() {
		return cart;
	}
	public WebElement Go_Checkout() {
		return checkout;
	}
	public WebElement Remove_whatsappimg() {
		return remove_whatsapp;
	}
	public WebElement continuebutton() {
		return continuebutton;
	}
}
