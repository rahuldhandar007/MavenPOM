package com.jbk.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.Pages.DashboardPage;
import com.jbk.Pages.LoginPage;
import com.jbk.Pages.UserPage;
import com.jbk.TestBase.TestBase;

public class UserPageTest extends TestBase {

	LoginPage lp;
	DashboardPage dp;
	UserPage up;
	public UserPageTest() throws Exception {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		up=loadLoginPage(driver).Log_In(driver).navigateTouserPage(driver);
		up= new UserPage(driver);
	}

	@Test(priority=1)
	public void verifyHeaderOfUPTest(){
		Assert.assertEquals(up.verifyheaderactList(), up.verifyHeaderOfUP());
	}
	@Test(priority=2)
	public void VerifyGenderTest(){
		Assert.assertTrue(up.VerifyGender());
	}
	@Test(priority=3)
	public void  verifyStateTest(){
		Assert.assertFalse(up.VerifyState());
	}
	@Test(priority=4)
	public void UserPageTitleTest(){
		Assert.assertEquals(up.UserPageTitle(), "JavaByKiran | User");
	}
	@Test(priority=5)
	public void printUserTableTest(){
		Assert.assertTrue(up.printUserTable());
	}
	@Test(priority=5)
	public void VerifyValidMobnoTest(){
		Assert.assertEquals(up.VerifyValidMobno(), up.mobnum);
	}
	@Test(priority=6)
	public void addUserTest() throws Exception{
		Assert.assertEquals(up.addUser(), "User Added Successfully. You can not see added user.");
	}
	@Test(priority=7)
	public void ContactDetailsTest(){
		Assert.assertTrue(up.ContactDetails());
	}
	@Test(priority=8)
	public void UserGenderTest() throws Exception{
		Assert.assertEquals(up.UserGender(), "Male");
	}
}