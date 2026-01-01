package selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Verify {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		
		//Title Verification
		if(driver.getTitle().equals("HRMS")) {
		System.out.println("Title Matched");
		}
		else {
			System.out.println("Title Not Matched");
			System.out.println("Title :" +driver.getTitle());
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		if(driver.getTitle().equals("SureshIT")) {
			System.out.println("Title Matched");
			System.out.println("Title :" +driver.getTitle());
		}
		else {
			System.out.println("Title Not Matched");
			System.out.println("Title :" +driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.quit();

	}

}
