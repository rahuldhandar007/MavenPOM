package com.Object_Repository;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage_ObjectRepository {
	@FindBy(id="email")
	public WebElement uname;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(id="Male")
	public WebElement male;
	
	@FindBy(id="Female")
	public WebElement female;
	
	@FindBy(xpath="//button")
	public WebElement lgnbtn;
	
	@FindBy(xpath="//span[text()='Users']")
	public WebElement userclick;
	
	@FindBy(xpath="//tr")
	public List<WebElement> headers;
	
	@FindBy(xpath="//td[6]")
	public List<WebElement> gender;

	@FindBy(xpath="//td[7]")
	public List<WebElement> state;
	
	@FindBy(xpath="//td[4]")
	public List<WebElement> mobnum;
	
	@FindBy(xpath ="//tr/td[2]")
	public List<WebElement> username;
	
	@FindBy(xpath ="//td[2]")
	public List<WebElement> forUser;
	
	@FindBy(xpath ="//tbody")
	public WebElement table;
	
	@FindBy(tagName="tr")
	public List<WebElement> tablerow;
	
	@FindBy(tagName="th")
	public List<WebElement> tableheader;

	@FindBy(xpath="//span[text()= 'Users']")
	public WebElement users;

	@FindBy(xpath=("//button[text()='Add User']"))
	public WebElement adduser;
	
	@FindBy(id=("username"))
	public WebElement name;
	
	@FindBy(id=("mobile"))
	public WebElement mob;
	
	@FindBy(id=("email"))
	public WebElement mail;
	
	@FindBy(id=("course"))
	public WebElement course;
	
	@FindBy(id=("submit"))
	public WebElement btn;
	
	@FindBy(tagName=("select"))
	public WebElement select;
}
