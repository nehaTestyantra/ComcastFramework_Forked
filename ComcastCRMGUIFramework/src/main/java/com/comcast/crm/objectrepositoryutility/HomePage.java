package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Products")
	private WebElement productsLink;
	
	public WebElement getProductsLink() {
		return productsLink;
	}

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactLink;

	@FindBy(xpath = "//td[@class=\"small\"]//tr/td[2]/img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement adminImg;

	@FindAll({ @FindBy(xpath = "//a[.='Sign Out']"), @FindBy(className = "drop_down_usersettings") })
	private WebElement signOutbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdminImg() {
		return adminImg;
	}

	public WebElement getSignOutbtn() {
		return signOutbtn;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public void signOut() {
		Actions act = new Actions(driver);
		act.moveToElement(adminImg).perform();
		signOutbtn.click();
	}

	public void contactLink() {
		contactLink.click();
	}

}
