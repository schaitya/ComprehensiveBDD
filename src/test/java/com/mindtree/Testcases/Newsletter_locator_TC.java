package com.mindtree.Testcases;

import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.pageobjects.Newsletter_Locator;
import com.mindtree.utilities.Base;

public class Newsletter_locator_TC extends Base{
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	@Test
	public void Newsletter_Locator() throws InterruptedException
	{
		
		driver.get(baseURL);
		String title=null;
		Newsletter_Locator nl=new Newsletter_Locator(driver,test);
		nl.Newsletter().sendKeys("s4romitraj@gmail.com",Keys.ENTER);
		log.info("User email id entered");
		test.info("User email id entered");
	//	nl.Submit_newsletter().click();
		log.info("Signup button clicked");
		test.info("Signup button clicked");
		  String main=driver.getWindowHandle();
		  Set<String> ab=driver.getWindowHandles();
		        Iterator<String> it=ab.iterator();
		        while(it.hasNext())
		        {
		        	driver.switchTo().window(it.next());
		        	title=driver.getTitle();
		        }
		        driver.switchTo().window(main);
		        Assert.assertEquals(title, "Newsletter");
		        log.error("Page not found");
	}
}
