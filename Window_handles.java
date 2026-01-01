
package selenium_Programs;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/hi/Downloads/multiplewindows.html");
			Thread.sleep(2000);
			System.out.println("window 1 opened");
			
			driver.findElement(By.id("btn2")).click();
			Thread.sleep(2000);
			System.out.println("window 2 opened");
			
			driver.findElement(By.id("btn3")).click();
			Thread.sleep(2000);
			System.out.println("window 3 opened");
			
			ArrayList <String> windinfo = new ArrayList <String>(driver.getWindowHandles());
			driver.switchTo().window(windinfo.get(1));
			
			driver.quit();
			
		}

	}
