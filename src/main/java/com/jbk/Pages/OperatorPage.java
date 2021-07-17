package com.jbk.Pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.Object_Repository.OperatorPageObjectRepository;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class OperatorPage extends OperatorPageObjectRepository {

	WebDriver driver;
	public OperatorPage(WebDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public boolean validUserForWhatsappAndPhoneCalls(){
		for(int i=0 ; i<WayToConnect.size() ; i++) {
			String PersonName = WayToConnect.get(i).getText();
			if (PersonName.contains("Whats App") && PersonName.contains("Phone Call")){
				String username = Personlist.get(i).getText();
				System.out.println("Person name who is available with Whats App && Phone Call only::"+username);
			}
		}
		return true;
		}

	public boolean TechnicalPerson() {
		for(int i=0 ; i<forTechnical.size() ; i++) {
			String PersonName = forTechnical.get(i).getText();
			if (PersonName.contains("Technical")){
				String username = Personlist.get(i).getText();
				System.out.println("Person name who works in technicality::"+username);
			}
		}
	return true;	
	}

	//verify operators header
	public boolean TestHeader() throws Exception{
		ArrayList<String> actualHeader=new ArrayList<String>();
		for (WebElement webElement : header) {
			System.out.println(webElement.getText());
			actualHeader.add(webElement.getText());
		}
		
		ArrayList<String>expHeader=new ArrayList<String>();
		FileInputStream fis = new FileInputStream("OperatorPage.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("operator");
		int rows = sh.getRows();  //how many rows have a data
		int columns = sh.getColumns();  //how many columns have a data
		System.out.println("The no. of rows and column are::"+rows+ "and" +columns);

		for(int i=0; i<1; i++) {  
			for(int j=0; j<columns;j++) {
				Cell cell =  sh.getCell(j,i);	
				String data =  cell.getContents();
				System.out.println(data+" ");
				expHeader.add(data);
			}
			System.out.println();
		}
		if(actualHeader.equals(expHeader)){
			System.out.println("Matched");
			return true;
		}
		else{
			System.out.println("Not Matched");
			return false;
		}	
	}

	//verify Operator title
	public String verifyTitle(){
		return driver.getTitle();
	}
	
	public boolean printUsersWithTimings(){
		ArrayList<String> userList=new ArrayList<String>();
		for (WebElement ele : Personlist) {
			String value=ele.getText();
			userList.add(value);
		}
		ArrayList<String> timingList=new ArrayList<String>();
		for (WebElement ele : timings) {
			String value=ele.getText();
			timingList.add(value);
		}
		for(int i=0;i<timingList.size();i++){
			String uname=timingList.get(i);
			if(uname.contains("09:00 AM to 06:00 PM ")){
				String username=userList.get(i);
				System.out.println("The Timing of " + username +" is 09:00 AM to 06:00 PM");
			}
		
		}
	
		return true;
	}

}
