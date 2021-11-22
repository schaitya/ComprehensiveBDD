package com.mindtree.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.pageobjects.Loginpage;
import com.mindtree.utilities.Base;
import com.mindtree.utilities.ReadConfig;

public class Loginpage_TC extends Base{
	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	public String excellocation=readconfig.Excel();

	public static Logger log= LogManager.getLogger(Base.class.getName());
	@Test
	public void Loginpage() throws IOException, InterruptedException
	{	
		
		driver.get(baseURL);
		Loginpage lp=new Loginpage(driver,test);
		lp.Login_click().click();
		log.info("Login Page loaded successfully");
		test.info("Login Page loaded successfully");
		File scr1=new File(excellocation);
		FileInputStream fis1 = new FileInputStream(scr1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		Row secondRow = rows.next();

		Iterator<Cell> ce1 = firstRow.cellIterator();
		ce1.next();
		String email = ce1.next().getStringCellValue();
		Iterator<Cell> ce2 = secondRow.cellIterator();
		ce2.next();
		String password = ce2.next().getStringCellValue();
		lp.Email().sendKeys(email);
		log.info("Email entered successfully");
		test.info("Email entered successfully");
		lp.Password().sendKeys(password);
		log.info("password entered successfully");
		test.info("password entered successfully");
		lp.Sign_in().click();
		Thread.sleep(2000);
		//assertTrue(driver.getTitle().contains("bigsmall.in/challenge"));
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Challenge– Bigsmall.in";
		assertEquals(expectedTitle,actualTitle);
		log.info("user navigated to login verification");
		test.info("user navigated to login verification");
	}
}

