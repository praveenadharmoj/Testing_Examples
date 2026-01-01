package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Mouseover {
	
	@Test
	public void tng() throws Exception {
		
		General g = new General();
		
		g.openApplication();
		g.login();			
		g.pim();
		g.addemp();
		g.openframe();
		g.emp_details();
		g.closeframe();
		g.logout();
		g.closeApplication();
		
	}

}
