package com.mindtree.stepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;

import com.mindtree.pageobjects.RegisterationObjects;
import com.mindtree.utilities.Base;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class RegisterationTestDefinations extends Base{
	RegisterationObjects obj = new RegisterationObjects(driver);
    
    @And("^visit create account page$")
    public void visit_create_account_page() throws Throwable {
    	obj.getLogin().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		obj.getRegister().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^the (.+) (.+) (.+) and (.+) are entered$")
    public void the_and_are_entered(String fname, String lname, String email, String pass) throws Throwable {
    	obj.getfName().sendKeys(fname);
		obj.getlName().sendKeys(lname);
		obj.getEmail().sendKeys(email);
		obj.getPass().sendKeys(pass);
		Thread.sleep(3000l);
		obj.getSubmit().click();
		Thread.sleep(3000l);
		String title = "Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in";
		assertEquals(driver.getTitle(), title);
    }

    @Then("^user will be registered and logged in$")
    public void user_will_be_registered_and_logged_in() throws Throwable {
		obj.getAccount().click();
		Thread.sleep(1000l);
		obj.getLogOut().click();
    }



}