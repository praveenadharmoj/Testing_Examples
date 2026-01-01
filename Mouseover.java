package selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();		
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		
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
		driver.close();
		

	}

}
