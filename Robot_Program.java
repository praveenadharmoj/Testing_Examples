package selenium_Programs;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.event.KeyEvent;
//import java.awt.Robot;

public class Robot_Program {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("Tab Key Pressed");
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Enter Key Pressed");
		
		System.out.println("Login Successfully");
		
		driver.close();
	}

}
