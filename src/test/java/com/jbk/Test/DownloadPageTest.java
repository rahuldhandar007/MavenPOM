package com.jbk.Test;

import org.testng.annotations.BeforeMethod;
import com.jbk.Pages.DownloadPage;
import com.jbk.Pages.LoginPage;
import com.jbk.TestBase.TestBase;

public class DownloadPageTest extends TestBase {

	LoginPage lp;
    DownloadPage dp;
	public DownloadPageTest() throws Exception {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		dp=loadLoginPage(driver).Log_In(driver).navigateToDownloadPage(driver);
		dp= new DownloadPage(driver);
	}
}
