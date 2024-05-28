package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganizationPage {

	WebDriver driver;

	public CreateNewOrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "accountname")
	private WebElement orgNameEdt;
	
	@FindBy(name="accounttype")
	private WebElement accountType;
	
	@FindBy(name="phone")
	private WebElement phone;

	@FindBy(xpath = "//img[@title=\"Create Organization...\"]")
	private WebElement newOrgBtn;

	@FindBy(name = "industry")
	private WebElement industrydd;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getAccountType() {
		return accountType;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getIndustrydd() {
		return industrydd;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNewOrgBtn() {
		return newOrgBtn;
	}

	public void selectIndustry(String industry) {
		Select sel = new Select(industrydd);
		sel.selectByValue(industry);
	}
	public void selectAccountType(String type)
	{
		Select sel= new Select(accountType);
		sel.selectByValue(type);
	}

	public void createOrg(String orgName) {

		orgNameEdt.sendKeys(orgName);
		saveBtn.click();

	}
	
}
