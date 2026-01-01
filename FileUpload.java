package com.hrms.testscripts;

import com.hrms.lib.General;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				
		General g = new General();
		
		g.openApplication();
		g.login();			
		g.pim();
		g.addemp();
		g.openframe();
		g.emp_details();
		g.emp_img();
		g.save_button();
		g.closeframe();
		g.logout();
		g.closeApplication();
	

	}

}
