package com.jbk.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.Object_Repository.UsefulLinkPageObjectRepository;

public class UsefulLinkPage extends UsefulLinkPageObjectRepository {
	WebDriver driver;

	 public UsefulLinkPage(WebDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   
	 
}