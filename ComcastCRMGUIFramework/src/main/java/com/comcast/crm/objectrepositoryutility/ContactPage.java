package com.comcast.crm.objectrepositoryutility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	WebDriver driver ;
	public ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactBtn;

	@FindBy(xpath = "//input[@name='support_start_date']")
	private WebElement startDate;

	@FindBy(name = "support_end_date")
	private WebElement endDate;

	@FindBy(name = "lastname")
	private WebElement lastnameTextfield;

	@FindBy(className = "dvHeaderText")
	private WebElement headermsg;

	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\" and @value=\"  Save  \"]")
	private WebElement saveBtn;

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateContactBtn() {
		return createContactBtn;
	}

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public void createContactWithSupportDate(String lastname, String startdate, String enddate) throws InterruptedException {
		contactLink.click();
		createContactBtn.click();
		Thread.sleep(2000);
		lastnameTextfield.sendKeys(lastname);
		startDate.sendKeys(startdate);
		endDate.sendKeys(enddate);
		//saveBtn.click();
	}

	

	public void createContact(String lastname) {
		createContactBtn.click();
		lastnameTextfield.sendKeys(lastname);
		saveBtn.click();
	}

	public WebElement getHeadermsg() {
		return headermsg;
	}

}
