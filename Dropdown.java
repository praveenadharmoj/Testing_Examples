package selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();		
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Thread.sleep(2000);
		
		driver.switchTo().frame("rightMenu");
		System.out.println("Entered into Frame");
	
        //Search By
		Select st = new Select(driver.findElement(By.id("loc_code")));
		Thread.sleep(2000);
		st.selectByVisibleText("Emp. ID");
		System.out.println("Emp Id Dropdown from Search By");
		Thread.sleep(1000);
		driver.findElement(By.id("loc_name")).sendKeys("2495");
		System.out.println("Entered Empid");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("Clicked on Search");
		Thread.sleep(1000);
		driver.findElement(By.name("chkLocID[]")).click();
		System.out.println("Clicked on Checkbox");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		System.out.println("Clicked on Del button");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		System.out.println("Frame closed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.quit();
		
		
	}

}
