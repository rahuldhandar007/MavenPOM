package com.jbk.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.Object_Repository.Log_In_Page_ObjectRepository;


public class LoginPage extends Log_In_Page_ObjectRepository {
      
	WebDriver driver=null;
	//initialization of page object		
	public LoginPage(WebDriver driver) throws Exception{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//Actions


	// correct email and incorrect password
	public String invalidLogin() {
		uname.sendKeys("Kiran@gmail.com");
		pass.sendKeys("123");
		lgnbtn.click();
		return err_msg.getText();
	}

	//testcase to check the java by kiran
	public String checkHeader(){
		System.out.println(header.getText());
		return header.getText();
	}

	//TestCase for valid password and blank email
	public void invalidLogin1(){
		uname.sendKeys();
		pass.sendKeys("123456");
		lgnbtn.click();
	}

	public boolean verifyLogo(){
		return logo.isDisplayed();
	}
	
	
	public String Register_New_Member() {

		register.click();
		regName.sendKeys("Rahul");
		mobile.sendKeys("7588750205");
		email.sendKeys("rahuldhandar007@gmail.com");
		password.sendKeys("1232456");
		submit.click();
		driver.switchTo().alert().accept();
		return driver.getTitle();
	}
	
	//for log in page
	public DashboardPage Log_In(WebDriver driver) throws Exception {
		uname.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		lgnbtn.click();
		return new DashboardPage(driver);
		}
	
		//testcase to check the "JAVA | SELENIUM |PYTHON
		public String verifySubHeading(){
			String act=subHeading.getText();
			return  act;
		}
}
