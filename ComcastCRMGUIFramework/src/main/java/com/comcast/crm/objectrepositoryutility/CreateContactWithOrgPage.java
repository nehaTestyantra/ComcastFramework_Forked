package com.comcast.crm.objectrepositoryutility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactWithOrgPage {
	WebDriver driver;

	public CreateContactWithOrgPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement selectOrgBtn;

	@FindBy(xpath = "//img[@title=\"Create Contact...\"]")
	private WebElement creatContactBtn;

	public WebElement getCreatContactBtn() {
		return creatContactBtn;
	}

	public WebElement getSelectOrgBtn() {
		return selectOrgBtn;
	}

	@FindBy(name = "lastname")
	private WebElement lastNametf;

	public WebElement getLastNametf() {
		return lastNametf;
	}

	@FindBy(linkText = "Contacts")
	private WebElement contactLink;

	public WebElement getContactLink() {
		return contactLink;
	}

	@FindBy(name = "search_text")
	private WebElement searchtf;

	@FindBy(name = "search")
	private WebElement searchbtn;

	public WebElement getSearchtf() {
		return searchtf;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	@FindBy(xpath = "//input[@class=\"crmButton small save\"]")
	private WebElement saveBtn;

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void switchToChild() {
		// switch to child window
				Set<String> set = driver.getWindowHandles();
				Iterator<String> it = set.iterator();

				while (it.hasNext()) {
					String windowID = it.next();
					driver.switchTo().window(windowID);

					String actUrl = driver.getCurrentUrl();
					if (actUrl.contains("module=Accounts")) {
						break;
					}
				}}
				
	public void switchBack() {
		// switch to parent window
				Set<String> set1 = driver.getWindowHandles();
				Iterator<String> it1 = set1.iterator();
				while (it1.hasNext()) {
					String windowID = it1.next();
					driver.switchTo().window(windowID);

					String actUrl = driver.getCurrentUrl();
					if (actUrl.contains("Contacts&action")) {
						break;
					}
				}
	}
	

}
