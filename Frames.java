package selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String args[]) throws Exception {
		
		WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");

			driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
			driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login Completed");
			Thread.sleep(1000);
			
driver.switchTo().frame("rightMenu");
System.out.println("Enterd into Frame");
Thread.sleep(1000);
// Add Button
driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
Thread.sleep(2000);
System.out.println("Clicked on Add Button");
// First & Last Name
driver.findElement(By.name("txtEmpLastName")).sendKeys("hi");
driver.findElement(By.name("txtEmpFirstName")).sendKeys("hello");
//save Button
driver.findElement(By.xpath("//input[@type='button'][@value='Save']")).click();
Thread.sleep(1000);
// Logout
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();
	}

}
