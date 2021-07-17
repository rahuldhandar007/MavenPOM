package com.jbk.Pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.Object_Repository.UserPage_ObjectRepository;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class UserPage extends UserPage_ObjectRepository {
	WebDriver driver;
	
	public UserPage(WebDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<String> verifyHeaderOfUP(){
		ArrayList<String> expected=new ArrayList<String>();
		expected.add("#");
		expected.add("Username");
		expected.add("Email");
		expected.add("Mobile");
		expected.add("Course");
		expected.add("Gender");
		expected.add("State");
		expected.add("Action");
		return expected;
	}
	public ArrayList<String> verifyheaderactList(){
		ArrayList<String> actual=new ArrayList<String>();
		for (WebElement Element : headers) {
			System.out.println(Element.getText());
			actual.add(Element.getText());
		}
		for (String string : actual) {
			System.out.println(string);
		}
		return actual;	
	}

	public boolean VerifyGender(){
		for (WebElement Element : gender) {
			String actual=Element.getText();
			boolean expect=actual.equals("Male") || actual.equals("Female");
			System.out.println(actual);
			return expect;
		}
		return true ;
	}

	public boolean VerifyState(){
		ArrayList<String> states = new ArrayList<String>();
	
		for (WebElement webElement : state) {
		String tag=webElement.getText();
		System.out.println(tag);
		}
		return states.contains(states);
	}

	public String UserPageTitle(){
		return driver.getTitle();	
	}
	
	public boolean printUserTable(){
		// for Table Element of known row and column
		//for table head th
		/*	     for(int i=1; i<=1; i++) {
	    	 for(int j=1;j<=8;j++) {
	    		WebElement th = driver.findElement(By.xpath("//th"));
	    		 System.out.print(th.getText()+"\t"+"\t");
	    	 }
	    System.out.println();	 
	     }
	     //for table row tr
	     for(int i=2; i<=5; i++) {
	    	 for(int j=1;j<=8;j++) {
	    		WebElement td = driver.findElement(By.xpath("//td"));
	    		 System.out.print(td.getText()+"\t"+"\t");
	    	 }
	    System.out.println();	 
	     }

		 */	     
		//for table element of unknown row and column
		System.out.println(tablerow.size());
		for (WebElement row : tablerow) {
			System.out.println(row.getText());
		}

		System.out.println(tableheader.size());
		return true;
	}

	public List<WebElement> VerifyValidMobno(){

		//List<WebElement> mobnum=driver.findElements(By.xpath("//td[4]"));
		for (WebElement webElement : mobnum) {
			String text=webElement.getText();
			int digits= text.length();
			if(digits==10){
			//int i= mobnum.indexOf(webElement)+2;
			//	WebElement web=driver.findElement(By.xpath("//tr["+i+"]/td[2]"));
				System.out.println("mobile is correct:"+username);
				
			}
			else{
				//int i= mobnum.indexOf(webElement)+2;
				//WebElement web=driver.findElement(By.xpath("//tr["+i+"]/td[2]"));
				System.out.println("mobile is not correct:"+username);
			}
		}
		return username;
	}
	
	public boolean ContactDetails() {
		for(int i=0 ; i<forUser.size() ; i++) {
			String PersonName = forUser.get(i).getText();
			String username = PersonName.toString();
			String Mobno = mobnum.get(i).getText();
			String contactNo=Mobno.toString();
			System.out.println("Person name ::"+username+ " whose mobile no. is::"+contactNo);
		}
       return true;
	}
	///////////////////////////////////////////////////////////
	public String getData(int row , int col)throws Exception {
		FileInputStream fis = new FileInputStream("UserTable.xls");
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet sh= wb.getSheet("User");//for login sheet

		Cell c = sh.getCell(col, row);
		return c.getContents();
	}
	public String UserGender()throws Exception {
		for(int i=0;i<5;i++) {		
			String data= getData(i, 5);
			if(data.equals("Male"))
				System.out.println(getData(i, 1));
		}
		return "Male";
	}
	//////////////////////////////////////////////////////////////////////////
	public String getData1(int row , int col)throws Exception {
		FileInputStream fis = new FileInputStream("UserTable.xls");
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet sh= wb.getSheet("addUser");//for add user sheet
		Cell c = sh.getCell(col, row);
		return c.getContents();
	}
	public String addUser() throws Exception {
		adduser.click();
		for(int i=1;i<2;i++) {
			name.sendKeys(getData1(i,0));
			mob.sendKeys(getData1(i,1));
			mail.sendKeys(getData1(i,2));
			course.sendKeys(getData1(i,3));
			if(getData1(i,4).equals("Male"))
			   male.click();
			else
				female.click();
			Select sel = new Select(select);
			sel.selectByVisibleText(getData1(i,5));
			pass.sendKeys(getData1(i,6));
			btn.click();
			Alert al = driver.switchTo().alert();
		    al.getText();
			al.accept();
		}
		return "User Added Successfully. You can not see added user.";
	}

}



