package com.hrms.testscripts;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Tng_jxl {
	
	WebDriver driver;
	
	@BeforeClass
	public void startUp() {
		driver = new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void tng() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\hi\\\\OneDrive\\\\Desktop\\\\JarFiles\\\\Excel\\\\Excel_Sheet.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet st = wb.getSheet(0);
		
		String un = st.getCell(1,1).getContents();
		String pw = st.getCell(2,1).getContents();
		
		System.out.println(un);
		Reporter.log(un);
        System.out.println(pw);
		Reporter.log(pw);
		Thread.sleep(4000);
	}
	

}
