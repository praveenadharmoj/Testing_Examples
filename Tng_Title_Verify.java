package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Title_Verify {
	
	@Test
	public void tng( ) throws Exception {
		
		General g = new General();
		
		g.openApplication();
		g.app_Title1();
		g.login();
		g.app_Title2();
		g.logout();
		g.closeApplication();
	}

}
