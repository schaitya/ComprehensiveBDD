package com.mindtree.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.SearchPage;
import com.mindtree.utilities.Base;

import io.cucumber.java.en.*;

public class SearchactionDefination extends Base{
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@When("user enter a product name {string} and click on search")
	public void user_enter_a_product_name_and_click_on_search(String string) throws InterruptedException {
		SearchPage sp=new SearchPage(driver,test);
		sp.product_enter().sendKeys(string);
		log.info("Searching for the product");
		test.info("Searching for the product");
		sp.Find_click().click();
		Thread.sleep(3000);
	}

	@Then("The searched product should be displayed on the result page")
	public void the_searched_product_should_be_displayed_on_the_result_page() {
		SearchPage sp=new SearchPage(driver,test);
		Assert.assertTrue(sp.productvisible().isDisplayed());
		log.info("Searched product displayed successfully");
		test.info("Searched product displayed successfully");
	}

}
