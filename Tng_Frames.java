package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Frames {
	
	@Test
	public void tng() throws Exception {
		
		General g = new General();
		
		g.openApplication();
		g.login();			
		g.openframe();
		g.searchby();
		g.searchfor();
		g.search_button();
		g.checkbox();
		g.delete_button();
		g.closeframe();
		g.logout();
		g.closeApplication();
	}

}
