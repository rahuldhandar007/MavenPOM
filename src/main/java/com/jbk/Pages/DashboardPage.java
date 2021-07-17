package com.jbk.Pages;

import java.util.ArrayList;
import java.util.Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.Object_Repository.DashboardPage_ObjectRepository;


public class DashboardPage extends DashboardPage_ObjectRepository {
	WebDriver driver;

	public DashboardPage(WebDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   public UserPage navigateTouserPage(WebDriver driver) throws Exception{
		    userPageNavigate.click();
			return new UserPage(driver);
		}
	   
	   public OperatorPage navigateTooperatorPage(WebDriver driver) throws Exception{	
		    operatorPageNavigate.click();
			return new  OperatorPage(driver);
			
		}
	   
	   public UsefulLinkPage navigateTousefulLinkPage(WebDriver driver) throws Exception{
		   usefulLinksPageNavigate.click();
			return new UsefulLinkPage(driver);
			
		}

		public DownloadPage navigateToDownloadPage(WebDriver driver) throws Exception{	
			downloadPageNavigate.click();
			return new DownloadPage(driver);
			
		}

	

	public Collection<?> Verify_Courses() {
		/*ArrayList<String> expectedNames = new ArrayList<String>();
		expectedNames.add("Selenium");
		expectedNames.add("Java / J2EE");
		expectedNames.add("Python");
		expectedNames.add("Php");*/

		//List<WebElement> course = driver.findElements(By.tagName("h3"));
		ArrayList<String> actualNames = new ArrayList<String>();
		for (WebElement element : courses) {
			String text = element.getText();
			System.out.println("actualNames:"+text);
			actualNames.add(text);
		}
		return actualNames;

		/*for(int i=0;i<actualNames.size();i++) {
			Assert.assertEquals(actualNames.get(i), expectedNames.get(i));
		}*/
	}

	public Collection<?> Verify_Sub_Courses() {
		/*ArrayList<String> expectedNames = new ArrayList<String>();
		expectedNames.add("Automation Testing");
		expectedNames.add("Software Development");
		expectedNames.add("Data Science");
		expectedNames.add("Web Development");*/
		
		ArrayList<String> actualNames = new ArrayList<String>();
		for (WebElement element : subCourses) {
			String text = element.getText();
			System.out.println("actualNames:"+text);
			actualNames.add(text);
		}
		//Assert.assertEquals(actualNames, expectedNames);
		/*for(int i=0;i<actualNames.size();i++) {
		Assert.assertEquals(actualNames.get(i), expectedNames.get(i));
		}*/
		//return true;
		return actualNames;
	}

	// verify url of dashboard page after login
	public String TestURL(){
		return 	driver.getCurrentUrl();
	}
	
	//Testcase for title javabykiran|dashboard
	public String verifyDashTitle() {
		return driver.getTitle();
	}
	
	//verify heading of dashboard page(javabykiran)
	public String verifyDashHeading(){
		System.out.println(dashHeading.getText());
		return dashHeading.getText();
	}
	
	//verify menus at dashboard page 
	public Collection<?> verify_menus(){
		/*ArrayList<String> expected=new ArrayList<String>();
		expected.add("Dashboard");
		expected.add("Users");
		expected.add("Operators");
		expected.add("Useful Links");
		expected.add("Download");
		expected.add("Logout");*/

		ArrayList<String> actualResult=new ArrayList<String>();
		for (WebElement web : menus) {
			System.out.println(web.getText());
			actualResult.add(web.getText());
		}
		return actualResult;
	}
}
