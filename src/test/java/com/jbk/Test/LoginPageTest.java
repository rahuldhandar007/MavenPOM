package com.jbk.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.jbk.Pages.DashboardPage;
import com.jbk.Pages.LoginPage;
import com.jbk.TestBase.TestBase;

public class LoginPageTest extends TestBase{
     LoginPage lp=null;
     DashboardPage dp=null;
	public LoginPageTest() throws Exception {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		lp= new LoginPage(driver);
	}
	
	@Test(priority=1)
	public void invalidLoginTest(){
		Assert.assertEquals(lp.invalidLogin(), "Please enter password 123456");
	}
	
	@Test(priority=2)
	public void Log_InTest() throws Exception{
		dp = lp.Log_In(driver);
		 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test(priority=3)
	public void Register_New_MemberTest(){
		Assert.assertEquals(lp.Register_New_Member(), "JavaByKiran | Registration Page");	
	}
	@Test(priority=4)
	public void verifyLogoTest(){
		Assert.assertTrue(lp.verifyLogo());	;
	}
	@Test(priority=5)
	public void checkHeaderTest(){
		Assert.assertEquals(lp.checkHeader(), "Java By Kiran");
		
	}
	@Test(priority=6)
	public void subHeadingTest(){
		Assert.assertEquals(lp.verifySubHeading(), "JAVA | SELENIUM | PYTHON");
	}
}
