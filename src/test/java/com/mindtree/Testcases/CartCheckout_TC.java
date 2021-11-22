package com.mindtree.Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.pageobjects.Cart_Checkout;
import com.mindtree.utilities.Base;

public class CartCheckout_TC extends Base{
	
public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@Test
	public void cartcheckout() throws IOException, InterruptedException{
		driver.get(baseURL);
		Cart_Checkout cart=new Cart_Checkout(driver,test);
		cart.product_selection().click();
		cart.Add_cart().click();
		log.info("product added to cart");
		test.info("Product added to cart");
		cart.Continue_shop().click();
		cart.Cart().click();
		log.info("Navigated to cart");
		test.info("Navigated to cart");
		//cart.product_selection().click();
		//cart.Add_cart().click();
		log.info("Product added to cart successfully");
		test.info("Product added to cart successfully");
		cart.Go_Checkout().click();
		cart.Remove_whatsappimg().click();
		Assert.assertTrue(cart.continuebutton().isDisplayed());
		log.info("successfully navigated to the checkout page");
		test.info("successfully navigated to the checkout page");
	}
	}
