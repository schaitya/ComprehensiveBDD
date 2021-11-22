package com.mindtree.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.AllproductTab;
import com.mindtree.utilities.Base;

import io.cucumber.java.en.*;

public class AllproducttabDefination extends Base{
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@When("click on all of it tab in header")
	public void click_on_all_of_it_tab_in_header() {
		AllproductTab Apt=new AllproductTab(driver,test);
		Apt.AllTab().click();
		log.info("All tab clicked and page loaded");
		test.info("All tab clicked and page loaded");
	}

	@When("navigate to second page")
	public void navigate_to_second_page() {
		AllproductTab Apt=new AllproductTab(driver,test);
		Apt.Next_navigation().click();
		log.info("navigated to 2nd page");
		test.info("navigated to 2nd page");
	}

	@Then("validate a product on the loaded page")
	public void validate_a_product_on_the_loaded_page() {
		AllproductTab Apt=new AllproductTab(driver,test);
		Assert.assertTrue(Apt.Product_visibility().isDisplayed());
		log.info("Product is successfully displayed");
		test.info("Product is successfully displayed");
	}

}
