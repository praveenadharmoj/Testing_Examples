package selenium_Programs;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Jxl_Excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\hi\\OneDrive\\Desktop\\JarFiles\\Excel\\Excel_Sheet.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		
		// To Retrieve data from SINGLE ROW
		int row = 3;
		String empid = st.getCell(0,row).getContents();
		String empname = st.getCell(1,row).getContents();
		String empemail = st.getCell(2,row).getContents();
		String empno = st.getCell(3,row).getContents();
		
		System.out.println("Employee Details :" +empid+ "" 
		+empname+ "" +empemail+ "" +empno); 
		
		//To retrieve TOTAL DATA
		
		int rowcount = st.getRows();
		System.out.println("No of Rows :" +rowcount);
		
		for(int i=1; i<rowcount; i++) {
			String empid1 = st.getCell(0,i).getContents();
			String empname1 = st.getCell(1,i).getContents();
			String empemail1= st.getCell(2,i).getContents();
			String empno1 = st.getCell(3,i).getContents();
			
			System.out.println("Employee Details :" +empid1+ "" 
					+empname1+ "" +empemail1+ "" +empno1);
		}
		
	}

}
