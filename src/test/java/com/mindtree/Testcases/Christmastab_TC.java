package com.mindtree.Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.pageobjects.Christmas_Giftspage;
import com.mindtree.utilities.Base;

public class Christmastab_TC extends Base{


		public static Logger log= LogManager.getLogger(Base.class.getName());

		@Test
		public void christmas() throws IOException, InterruptedException{
			driver.get(baseURL);
			Christmas_Giftspage cg=new Christmas_Giftspage(driver);
			cg.christmas_tab_click().click();
			log.info("Clicked on the christmas tab");
			test.info("Clicked on the christmas tab");
			cg.Sortby_click().click();
			log.info("Clicked on the sort by option");
			test.info("Clicked on the sort by option");
			cg.Sort_selection().click();
			Assert.assertTrue(cg.Validate_pro().isDisplayed());
			log.info("Product validated after sorting");
			test.info("Product validated after sorting");
		}

}
