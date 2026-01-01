package com.hrms.lib;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.google.common.io.Files;

public class General extends Global {
	
	public void openApplication () {
		driver = new ChromeDriver();		
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
	}
	public void closeApplication () {
		driver.quit();
		System.out.println("Application Closed");
		Reporter.log("Application Closed");
	}
	public void login() throws Exception {
		driver.findElement(By.name(txtbox_username)).sendKeys(un);
		System.out.println("Username Entered");
		Reporter.log("Username Entered");
		driver.findElement(By.name(txtbox_password)).sendKeys(pw);
		System.out.println("Password Entered");
		Reporter.log("Password Entered");		
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Successfully");
		Reporter.log("Login Successfully");
		Thread.sleep(3000);
	}
	public void logout() {
		driver.findElement(By.linkText(btn_logout)).click();
		System.out.println("Logout Successfully");
		Reporter.log("Logout Successfully");
	}
	public void openframe( ) throws Exception {
		driver.switchTo().frame("rightMenu");
		System.out.println("Enterd into Frame");
		Reporter.log("Enterd into Frame");
		Thread.sleep(1000);
	}
	public void closeframe() {
		driver.switchTo().defaultContent();
		System.out.println("Closed frame");
		Reporter.log("Closed frame");
	}	
	public void pim() throws Exception {		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(mod_pim))).perform();
		System.out.println("Mouseover on PIM");
		Reporter.log("Mouseover on PIM");
		Thread.sleep(1000);
	}
	public void addemp() throws Exception {
		driver.findElement(By.xpath(mod_addemp)).click();
		System.out.println("Clicked on Add Emoloyee dropdown");
		Reporter.log("Clicked on Add Emoloyee dropdown");
		Thread.sleep(1000);
	}
	public void emp_details() {
		driver.findElement(By.name(txtbox_emp_ln)).sendKeys(emp_ln);
		System.out.println("Last Name Entered");
		Reporter.log("Last Name Entered");
		driver.findElement(By.name(txtbox_emp_fn)).sendKeys(emp_fn);
		System.out.println("First Name Enterd");
		Reporter.log("First Name Enterd");
		driver.findElement(By.name(txtbox_emp_mn)).sendKeys(emp_mn);
		System.out.println("Middle Name Enterd");
		Reporter.log("Middle Name Enterd");
		driver.findElement(By.name(txtbox_emp_nn)).sendKeys(emp_nn);
		System.out.println("Nick Name Enterd");
		Reporter.log("Nick Name Enterd");
	}
	public void emp_img() {
		driver.findElement(By.id(img_link)).sendKeys(img);
		System.out.println("Image uploaded Successfully");
		Reporter.log("Image uploaded Successfully");
	}
	public void addbutton() {
		driver.findElement(By.xpath(btnadd)).click();
		System.out.println("Clicked on Add button");
		Reporter.log("Clicked on Add button");
	}
	public void save_button() {
		driver.findElement(By.xpath(btn_save)).click();
		System.out.println("Clicked on Save button");
		Reporter.log("Clicked on Save button");
	}
	public void reset_button() {
		driver.findElement(By.xpath(btn_reset)).click();
		System.out.println("Clicked on Reset button");
		Reporter.log("Clicked on Reset button");
	}
	public void searchby() {
//		driver.findElement(By.id(searchby_id)).sendKeys(lt_empid);
//		System.out.println("Clicked on EMP.ID dropdown");
//		Reporter.log("Clicked on EMP.ID dropdown");
		
		driver.findElement(By.id(searchby_id)).sendKeys(search_by_emp_fn);
		System.out.println("Clicked on EMPFN dropdown");
		Reporter.log("Clicked on EMPFN dropdown");
	}
	public void searchfor() {
//		driver.findElement(By.id(searchfor_id)).sendKeys(searchfor);
//		System.out.println("Enterd EMPID ");
	//	Reporter.log("Enterd EMPID ");
		
		driver.findElement(By.id(searchfor_id)).sendKeys(searchfor_emp_fn);
		System.out.println("Enterd EMPFN ");
		Reporter.log("Enterd EMPFN ");
	}
	public void search_button() {
		driver.findElement(By.xpath(btn_search)).click();
		System.out.println("Clicked on Search button");
		Reporter.log("Clicked on Search button");
	}
	public void checkbox() {
		driver.findElement(By.name(chkbox)).click();
		System.out.println("Clicked on Checkbox");
		Reporter.log("Clicked on Checkbox");
	}
	public void delete_button() {
		driver.findElement(By.xpath(btn_del)).click();
		System.out.println("Clicked on Delete button");
		Reporter.log("Clicked on Delete button");
	}
	//Alert
	public void popup() {
	Alert a = driver.switchTo().alert();
	System.out.println("Alert Text:" +a.getText());
	Reporter.log("Alert Text:" +a.getText());
	a.accept();
	}
	//PopUp_Login
	public void pop_login() throws Exception {
		driver.findElement(By.name(txtbox_username)).sendKeys(un);
		System.out.println("Username Entered");
		Reporter.log("Username Entered");
//		driver.findElement(By.name(txtbox_password)).sendKeys(pw);
//		System.out.println("Password Entered");
//		Reporter.log("Password Entered");
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login into Application");
		Reporter.log("Login into Application");
		Thread.sleep(3000);
	}
	//Clear
	public void clear_button() throws Exception {
		driver.findElement(By.xpath(btn_clear)).click();
		Thread.sleep(2000);
		System.out.println("Cleared Username");
		Reporter.log("Cleared Username");
	}
	//JSE_Login
	public void jse_login() {
	WebElement ele = driver.findElement(By.name(btn_login));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()",ele);
	}
	//JSE_Logout
	public void jse_logout() {
		WebElement ele = driver.findElement(By.linkText(btn_logout));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
	}
	//Titles
	public void app_Title1() {
		if(driver.getTitle().equals(Title1)) {
		System.out.println("Title Matched");
		Reporter.log("Title Matched");
	}
		else {
			System.out.println("Title Not matched");
			Reporter.log("Title Not matched");
			System.out.println("Title :" +driver.getTitle());
			Reporter.log("Title :" +driver.getTitle());
		}
		}
	public void app_Title2() {
		if(driver.getTitle().equals(Title2)) {
			System.out.println("Title Matched");
			Reporter.log("Title Matched");
		}
			else {
				System.out.println("Title Not matched");
				Reporter.log("Title Not matched");
				System.out.println("Title :" +driver.getTitle());
				Reporter.log("Title :" +driver.getTitle());
			}
	}
	//GoogleChrome
	public void chrome_Url () {
		driver = new ChromeDriver();
		driver.navigate().to(gc_Url);
	}
	// Keys_User Input from Keyboard
	public void user_Input() throws Exception {
		driver.findElement(By.id(Goog_Search_id)).sendKeys(goog_Ue_Ip);
		System.out.println("Entered User Input");
		Reporter.log("Entered User Input");
		WebElement searchBox = driver.findElement(By.id(Goog_Search_id));
		String text = searchBox.getAttribute("value");
		System.out.println("Text from Search box:" +text);
		Reporter.log("Text fromSearch box:" +text);
		Thread.sleep(2000);
		driver.findElement(By.id(Goog_Search_id)).sendKeys(Keys.ARROW_DOWN);
		System.out.println("Moved to Next Line");
		Reporter.log("Moved to Next Line");
		WebElement searchBox2 = driver.findElement(By.id(Goog_Search_id));
		String text2 = searchBox2.getAttribute("value");
		System.out.println("Text fromSearch box:" +text2);
		Reporter.log("Text from Search box:" +text2);
		Thread.sleep(2000);
		driver.findElement(By.id(Goog_Search_id)).sendKeys(Keys.ARROW_DOWN);
		System.out.println("Moved to Next Line");
		Reporter.log("Moved to Next Line");
		WebElement searchBox1 = driver.findElement(By.id(Goog_Search_id));
		String text1 = searchBox1.getAttribute("value");
		System.out.println("Text from Search box:" +text1);
		Reporter.log("Text fromSearch box:" +text1);
		Thread.sleep(2000);
		driver.findElement(By.id(Goog_Search_id)).sendKeys(Keys.ARROW_DOWN);
		WebElement searchBox4 = driver.findElement(By.id(Goog_Search_id));
		String text4 = searchBox4.getAttribute("value");
		System.out.println("Text fromSearch box:" +text4);
		Reporter.log("Text fromSearch box:" +text4);
		System.out.println("clicked on Enter Button");
		Reporter.log("clicked on Enter Button");
		Thread.sleep(2000);
		System.out.println("Search completed");
		Reporter.log("Search completed");
		Thread.sleep(2000);
	}
	//Action
	public void cls_Action() throws Exception {
		Actions ac= new Actions(driver);
		// PIM
		ac.moveToElement(driver.findElement(By.xpath(act_cls))).perform();
		System.out.println("Clicked on PIM");
		Reporter.log("Clicked on PIM");
		Thread.sleep(1000);		
		//ADD EMPLOYEE
		driver.findElement(By.xpath(act_ae)).click();
		System.out.println("Clicked on Add Employee SubMenu");
		Reporter.log("Clicked on Add Employee SubMenu");
		Thread.sleep(1000);
	}
	//Test Result
	public void test_Result() throws Exception {
		File f1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f1,new File("C:\\Users\\hi\\OneDrive\\Desktop\\java\\selenium\\src//TestResult3.png"));
		System.out.println("ScreenShot Taken");
		Reporter.log("ScreenShot Taken");
	}
	
}
