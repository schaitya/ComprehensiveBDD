package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Christmas_Giftspage {

		public WebDriver driver;

		public Christmas_Giftspage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}


		@FindBy(xpath="//a[@href='/collections/christmas-gifts']")
		WebElement chritmas_tab;

		@FindBy(id="sortBy")
		WebElement sortby;

		@FindBy(xpath="//option[contains(text(),'Name (A - Z)')]")
		WebElement Sort_A_Z;

		@FindBy(xpath="		//div[contains(text(),'3 In 1 Smart Power Sound Lamp')]")
		WebElement Validate_product;

		public WebElement christmas_tab_click() {
			return chritmas_tab;
		}
		public WebElement Sortby_click() {
			return sortby;
		}
		public WebElement Sort_selection() {
			return Sort_A_Z;
		}
		public WebElement Validate_pro() {
			return Validate_product;
		}
}
