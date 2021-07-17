package com.jbk.Test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.Pages.DashboardPage;
import com.jbk.Pages.LoginPage;
import com.jbk.TestBase.TestBase;

public class DashboardPageTest extends TestBase {
	LoginPage lp;
	DashboardPage dp;

	public DashboardPageTest() throws Exception {
		super();
	}
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		dp= loadLoginPage(driver).Log_In(driver);
		dp= new DashboardPage(driver);
	}
	@Test()
	public void Verify_CoursesTest(){
		ArrayList<String> expectedNames = new ArrayList<String>();
		expectedNames.add("Selenium");
		expectedNames.add("Java / J2EE");
		expectedNames.add("Python");
		expectedNames.add("Php");
		Assert.assertEquals(dp.Verify_Courses(), expectedNames);
	}
	@Test
	public void Verify_Sub_CoursesTest(){
		ArrayList<String> expectedNames = new ArrayList<String>();
		expectedNames.add("Automation Testing");
		expectedNames.add("Software Development");
		expectedNames.add("Data Science");
		expectedNames.add("Web Development");
	Assert.assertEquals(dp.Verify_Sub_Courses(), expectedNames);
	}
	@Test
	public void TestURLTest(){
		String expmsg="file:///C:/adv%20java%20setup/Selenium%20Software/Offline%20Website/pages/examples/dashboard.html";
		Assert.assertEquals(dp.TestURL(), expmsg);
		
	}
	@Test
	public void verifyDashTitleTest(){
		String exp = "JavaByKiran | Dashboard";
		Assert.assertEquals(dp.verifyDashTitle(), exp);
	}
	@Test
	public void verifyDashHeadingTest(){
		String exp = "Java By Kiran";
		Assert.assertEquals(dp.verifyDashHeading(), exp);
	}
	@Test
	public void verify_menusTest(){
		ArrayList<String> expected=new ArrayList<String>();
		expected.add("Dashboard");
		expected.add("Users");
		expected.add("Operators");
		expected.add("Useful Links");
		expected.add("Downloads");
		expected.add("Logout");
		System.out.println(expected);
		Assert.assertEquals(dp.verify_menus(), expected);
	}
}
