package com.mindtree.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.Homepage;
import com.mindtree.utilities.Base;

import io.cucumber.java.en.*;

public class HomepageDefination extends Base {
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	@Given("User lands on Home Page")
	public void user_lands_on_home_page() {
		driver=setup();
		driver.get(baseURL);
	}

	@Then("BigSmall Website logo should be displayed")
	public void big_small_website_logo_should_be_displayed() {
		Homepage hp=new Homepage(driver,test);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertTrue(hp.Homepage_logo().isDisplayed());
	}
}
