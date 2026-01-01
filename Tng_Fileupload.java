package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Fileupload {
	
	@Test
	public void tng( ) throws Exception {
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
