package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Screenshot {
	
	@Test
	public void tng() throws Exception {
	General g = new General();
	
	try {
	g.openApplication();
	g.login();
	g.cls_Action();
	g.logout();
	}
	catch(Exception e) {
		g.test_Result();
	}
		g.closeApplication();
	}
}
