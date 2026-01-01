package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Alret {
	
	@Test
	public void tng() throws Exception {
		General g = new General();

		g.openApplication();
		g.pop_login();
		g.popup();
		g.clear_button();
		g.login();
		g.logout();
		g.closeApplication();
		
	}

}
