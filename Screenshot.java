package selenium_Programs;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
			System.out.println("Navigated to Application");
			driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
			driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login Successfully");
			
			Actions ac= new Actions(driver);
			// PIM
			ac.moveToElement(driver.findElement(By.xpath("//span[text()='PIM']"))).perform();
			System.out.println("Clicked on PIM");
			Thread.sleep(1000);
			//ADD EMPLOYEE
			driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
			System.out.println("Clicked on Add Employee SubMenu");	
			Thread.sleep(1000);

			driver.findElement(By.linkText("Logout")).click();
		}
		
		catch(Exception e) {
			File f1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f1,new File("C:\\Users\\hi\\OneDrive\\Desktop\\java\\selenium\\src//TestResult1.png"));
			System.out.println("ScreenShot Taken");
			Reporter.log("ScreenShot Taken");
		}
		driver.quit();

}
}
