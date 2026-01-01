package com.hrms.testscripts;

import com.hrms.lib.General;

public class Alert_Exp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
