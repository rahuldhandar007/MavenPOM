package com.jbk.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.jbk.Pages.LoginPage;
import com.jbk.Pages.OperatorPage;
import com.jbk.TestBase.TestBase;

public class OperatorPageTest extends TestBase{
	LoginPage lp;
    OperatorPage op;
	public OperatorPageTest() throws Exception {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		op=loadLoginPage(driver).Log_In(driver).navigateTooperatorPage(driver);
		op= new OperatorPage(driver);
	}
	
	@Test(priority=1)
	public void validUserForWhatsappAndPhoneCalls(){
		Assert.assertTrue(op.validUserForWhatsappAndPhoneCalls());
	}
	
	@Test(priority=2)
	public void TechnicalPersonTest (){
		Assert.assertTrue(op.TechnicalPerson());
	}

	@Test(priority=3)
	public void TestHeader () throws Exception{
		Assert.assertTrue(op.TestHeader());
	}

	@Test(priority=4)
	public void verifyTitle(){
		Assert.assertEquals(op.verifyTitle(), "JavaByKiran | Operators");
	}
	
	@Test(priority=5)
	public void printUsersWithTimingsTest(){
		Assert.assertTrue(op.printUsersWithTimings());
	}
}

