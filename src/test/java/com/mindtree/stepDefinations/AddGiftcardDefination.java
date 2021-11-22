package com.mindtree.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.AddGiftcard;
import com.mindtree.utilities.Base;

import io.cucumber.java.en.*;

public class AddGiftcardDefination extends Base{

	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@When("click on Giftcard")
	public void click_on_giftcard() {
		AddGiftcard gfcard=new AddGiftcard(driver,test);
		gfcard.Gift_card_section().click();
		log.info("navigated to Add giftcard section");
		test.info("navigated to Add giftcard section");
	}

	@When("click on add to cart")
	public void click_on_add_to_cart() throws InterruptedException {
		AddGiftcard gfcard=new AddGiftcard(driver,test);
		gfcard.Add_cart().click();
		Thread.sleep(2000);
		test.info("Gift card added");
	}

	@Then("validate the checkout option displayed or not")
	public void validate_the_checkout_option_displayed_or_not() {
		AddGiftcard gfcard=new AddGiftcard(driver,test);
		Assert.assertTrue(gfcard.checkout_availibility().isDisplayed());
		log.info("Gift card added successfully");
		test.info("Gift card added successfully");
	}

}
