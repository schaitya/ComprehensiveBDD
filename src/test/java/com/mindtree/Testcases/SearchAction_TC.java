package com.mindtree.Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.pageobjects.SearchPage;
import com.mindtree.utilities.Base;

public class SearchAction_TC extends Base{
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@Test
	public void Search() throws IOException, InterruptedException{
		driver.get(baseURL);
		SearchPage sp=new SearchPage(driver,test);
		sp.product_enter().sendKeys("Harry potter");
		log.info("Searching for the product");
		test.info("Searching for the product");
		sp.Find_click().click();
		Thread.sleep(3000);
		Assert.assertTrue(sp.productvisible().isDisplayed());
		log.info("Searched product displayed successfully");
		test.info("Searched product displayed successfully");
		
		
		
	}
}
