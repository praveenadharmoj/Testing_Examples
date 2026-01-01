package selenium_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();		
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		Thread.sleep(2000);
		driver.close();

	}

}
