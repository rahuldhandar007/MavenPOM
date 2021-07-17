package com.jbk.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.jbk.Pages.LoginPage;
import com.jbk.Utility.TestUtil;
import com.jbk.Utility.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
    public static WebEventListener eventlistener;

	public TestBase() throws Exception{
		FileInputStream file = new FileInputStream("D:/SeleniumWorkspace/Framework/src/main/java/com/jbk/Configue/config.properties");
		prop = new Properties();
		
		prop.load(file);
		String value = prop.getProperty("url");
		System.out.println(value);
	}
	
	public void initialization(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver =new ChromeDriver();
	    try {
	    	e_driver =new EventFiringWebDriver(driver);
			eventlistener = new WebEventListener();
			e_driver.register(eventlistener);
		    driver = e_driver;
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	public LoginPage  loadLoginPage(WebDriver driver) throws Exception{
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	
	
}


