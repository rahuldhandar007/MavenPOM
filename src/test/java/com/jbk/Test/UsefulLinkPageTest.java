package com.jbk.Test;

import org.testng.annotations.BeforeMethod;
import com.jbk.Pages.LoginPage;
import com.jbk.Pages.UsefulLinkPage;
import com.jbk.TestBase.TestBase;

public class UsefulLinkPageTest extends TestBase {

	LoginPage lp;
    UsefulLinkPage ufp;
	public UsefulLinkPageTest() throws Exception {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		ufp=loadLoginPage(driver).Log_In(driver).navigateTousefulLinkPage(driver);
		ufp= new UsefulLinkPage(driver);
	}
	
}
