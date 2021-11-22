package com.mindtree.Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.pageobjects.AllproductTab;
import com.mindtree.utilities.Base;

public class AllproductTab_TC extends Base{
	
public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@Test
	public void AllTab() throws IOException, InterruptedException{
		driver.get(baseURL);
		AllproductTab Apt=new AllproductTab(driver,test);
		Apt.AllTab().click();
		log.info("All tab clicked and page loaded");
		test.info("All tab clicked and page loaded");
		Apt.Next_navigation().click();
		log.info("navigated to 2nd page");
		Assert.assertTrue(Apt.Product_visibility().isDisplayed());
		log.info("Product is successfully displayed");
		test.info("Product is successfully displayed");
	
	}
}
