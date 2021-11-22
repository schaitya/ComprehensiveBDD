package com.mindtree.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.Contactpage;
import com.mindtree.utilities.Base;

import io.cucumber.java.en.*;

public class ContactpageDefination extends Base{
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@When("click contact us tab in footer")
	public void click_contact_us_tab_in_footer() {
		Contactpage cp=new Contactpage(driver,test);
		cp.Contact_us().click();
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
	}

	@When("Enter the name {string} email {string} and message {string} and click on send")
	public void enter_the_name_email_and_message_and_click_on_send(String string, String string2, String string3) throws InterruptedException {
		Contactpage cp=new Contactpage(driver,test);
		cp.Name().sendKeys(string);
		cp.EmailID().sendKeys(string2);
		cp.MessageBox().sendKeys(string3);
		test.info("detailed entered successfully");
		Thread.sleep(2000);
		test.warning("Test case may fail due to random captcha verifiation");
		cp.Send().click();
		Thread.sleep(3000);
	}

	@Then("Thankyou message displayed")
	public void thankyou_message_displayed() {
		Contactpage cp=new Contactpage(driver,test);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		test.info("message sent successfully");
	}
}
