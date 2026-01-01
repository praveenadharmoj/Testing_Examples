package selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hi/Downloads/WebTable.html");
		
		int rows = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		System.out.println("No of Rows :" +rows);
		int cols = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		System.out.println("No of Columns :" +cols);
		int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println("No of Rows&Colums :" +row_col);
		
		String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td[2]")).getText();
		System.out.println("Data in Specific Column :" +celldata);		
		
		for(int i=1; i<=rows; i++) {
			String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println("WEB TABLE :" +data);
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
