package com.jbk.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Object_Repository.DownloadPageObjectRepository;

public class DownloadPage extends DownloadPageObjectRepository {
	WebDriver driver=null;
	//initialization of page object		
	public DownloadPage(WebDriver driver) throws Exception{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
}
