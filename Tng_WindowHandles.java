package com.hrms.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Tng_WindowHandles {
	
	WebDriver driver;
	
	@AfterMethod
	public void SetUp() {
		driver.navigate().to("file:///C:/Users/hi/Downloads/multiplewindows.html");
		System.out.println("window 1 opened");
	}
	@Test
	public void tng() throws Exception {
		driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/hi/Downloads/multiplewindows.html");
		System.out.println("window 1 opened");
		
		
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(2000);
		System.out.println("window 2 opened");
		
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(2000);
		System.out.println("window 3 opened");
		
		ArrayList <String> windinfo = new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(windinfo.get(1));	
		System.out.println("window 1 opened");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("close");
	}

}
