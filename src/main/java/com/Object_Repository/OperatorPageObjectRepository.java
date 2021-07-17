package com.Object_Repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorPageObjectRepository {
	@FindBy(xpath= "//td[2]")
	public List<WebElement> Personlist;

	@FindBy(xpath= "//td[4]")
	public List<WebElement> WayToConnect;


	@FindBy(xpath= "//td[3]")
	public List<WebElement> forTechnical;

	@FindBy(xpath= "//tr")
	public List<WebElement> list;
	
	@FindBy(xpath= "//th")
	public List<WebElement> header;
	
	@FindBy(xpath = "//td[6]")
	public List<WebElement> timings;
}