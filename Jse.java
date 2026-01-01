package com.hrms.testscripts;

import com.hrms.lib.General;

public class Jse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		General g = new General();
		
		g.openApplication();
		g.login();
		g.jse_login();
		g.jse_logout();
		g.closeApplication();

	}

}
