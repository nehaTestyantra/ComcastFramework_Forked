package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage 
{
	@FindBy(id = "dtlview_Last Name")
	private WebElement lastnameContactinfopage;

	public WebElement getLastnameContactinfopage() {
		return lastnameContactinfopage;
	}
	public String getInfo(WebDriver driver) {
		WebElement lntextf = driver.findElement(By.xpath("//span[@id=\"dtlview_Last Name\"]"));
		String ln= lntextf.getText();
		return ln;
	}
	WebDriver driver;
	public ContactInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
