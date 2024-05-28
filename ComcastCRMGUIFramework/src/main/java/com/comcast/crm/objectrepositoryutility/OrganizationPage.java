package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	WebDriver driver;

	public OrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrg;
	@FindBy(name = "submit")
	private WebElement submitBtn;

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getCreateOrg() {
		return createOrg;
	}

	@FindBy(name = "search_text")
	private WebElement searchTextfield;

	@FindBy(name = "search_field")
	private WebElement searchDropdown;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchTextfield() {
		return searchTextfield;
	}

	public WebElement getSearchDropdown() {
		return searchDropdown;
	}

}
