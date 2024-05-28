package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {

	@FindBy(className="dvHeaderText")
	private WebElement headerMsg;
	
	WebDriver driver;
	public OrganizationInfoPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getHeaderMsg() {
		return headerMsg;
	}
	public WebDriver getDriver() {
		return driver;
	}
}
