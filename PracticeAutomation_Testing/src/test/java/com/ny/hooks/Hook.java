package com.ny.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import ups.nj.supperpage.SupperClass;

public class Hook extends SupperClass{
	@Before
public void startApplication() {
		openBrowser();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
