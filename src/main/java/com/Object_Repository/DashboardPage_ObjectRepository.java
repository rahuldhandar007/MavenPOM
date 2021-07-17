package com.Object_Repository;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage_ObjectRepository {
	@FindBy(id="email")
	public WebElement uname;

	@FindBy(id="password")
	public WebElement pass;

	@FindBy(xpath="//button")
	public WebElement lgnbtn;
	
	@FindBy(tagName="h3")
	public List<WebElement> courses;

	@FindBy(xpath="//div[@class='inner']//following::p")
	public List<WebElement> subCourses;
	
	@FindBy(xpath="//b[text()='Java By Kiran']")
	public WebElement dashHeading;
	
	@FindBy(xpath="//li//span")
	public List<WebElement> menus;
	
	@FindBy(xpath="//a[@href='users.html']")
	public  WebElement userPageNavigate;
	
	@FindBy(xpath="//a[@href='operators.html']")
	public  WebElement operatorPageNavigate;
	
	@FindBy(xpath="//a[@href='links.html']")
	public  WebElement usefulLinksPageNavigate;
	
	@FindBy(xpath="//span[text()='Downloads']")
	public  WebElement downloadPageNavigate;

}
