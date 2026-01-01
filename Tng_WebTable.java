package com.hrms.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tng_WebTable {
	
		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			driver = new ChromeDriver();
		}
		@Test
		public void tng() throws Exception {
		driver.navigate().to("file:///C:/Users/hi/Downloads/WebTable.html"); 
		int rows = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		System.out.println("No of Rows :" +rows);
		Reporter.log("No of Rows :" +rows);
		int cols = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		System.out.println("No of Columns :" +cols);
		Reporter.log("No of Columns :" +cols);
		int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println("No of Rows&Colums :" +row_col);
		Reporter.log("No of Rows&Colums :" +row_col);
		
		String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td[2]")).getText();
		System.out.println("Data in Specific Column :" +celldata);
		Reporter.log("Data in Specific Column :" +celldata);
		
		for(int i=1; i<=rows; i++) {
			String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println("WEB TABLE :" +data);
			Reporter.log("WEB TABLE :" +data);
			Thread.sleep(2000);
		}
	}
		@AfterMethod
		public void tearDown() {
			driver.quit();
	}

}
