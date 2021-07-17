package com.Object_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Log_In_Page_ObjectRepository {
	//page factory :: object repository
	@FindBy(id="email")
	public WebElement uname;

	@FindBy(id="password")
	public WebElement pass;

	@FindBy(xpath="//button")
	public WebElement lgnbtn;

	@FindBy(xpath="//img")
	public WebElement logo;

	@FindBy(xpath="//a[@class='text-center']")
	public WebElement register;

	@FindBy(id="password_error")
	public WebElement err_msg;

	@FindBy(xpath="//b")
	public WebElement header;
	
	//For register new membership on browser
	@FindBy(xpath="//input[@id='name']")
	public WebElement regName;

	@FindBy(xpath="//input[@id='mobile']")
	public WebElement mobile;

	@FindBy(xpath="//input[@id='email']")
	public WebElement email;

	@FindBy(xpath="//input[@id='password']")
	public WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;

	@FindBy(xpath="//h4")
	public WebElement subHeading;
}
