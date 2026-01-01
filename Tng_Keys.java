package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tng_Keys {
	
	@Test
	public void tng() throws Exception {
		
		General g= new General();
		
		g.chrome_Url();
		g.user_Input();
		g.closeApplication();
		
	}

}
