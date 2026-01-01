package selenium_Programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream files = new FileInputStream("C:\\Users\\hi\\OneDrive\\Desktop\\JarFiles\\Excel\\Emp_Excel_Sheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(files);
		XSSFSheet sheet = wb.getSheet("Details");
		
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating celldata :" +sheet.getRow(2).getCell(1));
		
		//Write data to Excel file
		XSSFCell cell = sheet.getRow(2).getCell(1);
		cell.setCellValue("Test");
		files.close();
		
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\hi\\\\OneDrive\\\\Desktop\\\\JarFiles\\\\Excel\\\\Excel_Sheet.xls");
 		wb.write(fos);
    	System.out.println("Updated data after write is done: " +cell.getStringCellValue());
		fos.close();
		
	}

}
