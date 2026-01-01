package com.hrms.testscripts;

import com.hrms.lib.General;

public class Dropdown {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
