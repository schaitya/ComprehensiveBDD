package com.mindtree.Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.pageobjects.Contactpage;
import com.mindtree.utilities.Base;

public class Contactpage_TC extends Base{
	public static Logger log= LogManager.getLogger(Base.class.getName());
	@Test
	public void ContactPage() throws InterruptedException
	{
		
		driver.get(baseURL);
		Contactpage cp=new Contactpage(driver,test);
		cp.Contact_us().click();
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
		cp.Name().sendKeys("yogi");
		cp.EmailID().sendKeys("admin@gmail.com");
		cp.MessageBox().sendKeys("issue with the product");
		test.info("detailed entered successfully");
		Thread.sleep(2000);
		test.warning("Test case may fail due to random captcha verifiation");
		cp.Send().click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		test.info("message sent successfully");
	}
}
