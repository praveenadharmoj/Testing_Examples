package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Jse {
	
	@Test
	public void tng() throws Exception {
		
		General g = new General();
		
		g.openApplication();
		g.login();
		g.jse_login();
		g.jse_logout();
		g.closeApplication();
		
	}

}
