package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class SearchPage {

	public WebDriver driver;
	public ExtentTest test;

	public SearchPage(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//header//div//form//input[@type='search']")
	WebElement product_name;

	@FindBy(xpath="//header//div//form//img[@class='st-search-icon']")
	WebElement clickfind;

	@FindBy(xpath="//span[contains(text(),'Harry Potter Pocket Watch')][1]")
	WebElement product;



	public WebElement product_enter()
	{
		return product_name;
	}
	public WebElement Find_click()
	{
		return product_name;
	}

	public WebElement productvisible()
	{
		return product;
	}


}
