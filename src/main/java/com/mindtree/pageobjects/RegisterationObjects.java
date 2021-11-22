package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterationObjects {

	public WebDriver driver;
	
	public RegisterationObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//header//a[@href='/account/login']")
	WebElement login;
	
	@FindBy(id="customer_register_link")
	WebElement register;
	
	@FindBy(id="FirstName")
	WebElement fName;
	
	@FindBy(id="LastName")
	WebElement lName;
	
	@FindBy(id="Email")
	WebElement email;

	@FindBy(id="CreatePassword")
	WebElement pass;
	
	@FindBy(xpath="//input[@value='Create']")
	WebElement submit;
	
	@FindBy(xpath="//header//a[@href='/account/']")
	WebElement account;
	
	@FindBy(id="customer_logout_link")
	WebElement logOut;
	

	public WebElement getAccount() {
		return account;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}
