package com.mindtree.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.Christmas_Giftspage;
import com.mindtree.utilities.Base;

import io.cucumber.java.en.*;

public class ChristmastabDefination extends Base{
		
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@When("click on christmasgift tab")
	public void click_on_christmasgift_tab() {
		Christmas_Giftspage cg=new Christmas_Giftspage(driver);
		cg.christmas_tab_click().click();
		log.info("Clicked on the christmas tab");
		test.info("Clicked on the christmas tab");
	}

	@When("click on drop down and select the A_Z option")
	public void click_on_drop_down_and_select_the_a_z_option() {
		Christmas_Giftspage cg=new Christmas_Giftspage(driver);
		cg.Sortby_click().click();
		log.info("Clicked on the sort by option");
		test.info("Clicked on the sort by option");
		cg.Sort_selection().click();
	}

	@Then("validate the product from that page")
	public void validate_the_product_from_that_page() {
		Christmas_Giftspage cg=new Christmas_Giftspage(driver);
		Assert.assertTrue(cg.Validate_pro().isDisplayed());
		log.info("Product validated after sorting");
		test.info("Product validated after sorting");
	}

}
