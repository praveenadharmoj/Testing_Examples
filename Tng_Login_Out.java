package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Login_Out {
	
	@Test
	
	public void Tng() throws Exception {
General g = new General();
		
		g.openApplication();
		g.login();			
		g.logout();
		g.closeApplication();
	}

}
