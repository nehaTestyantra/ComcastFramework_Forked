package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage{
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
  /**
   * 
   * @author NEHA ZUTTI
   * Contains Login page elements and business libraries like Login()
   */
	@FindBy(name = "user_name")
	private WebElement ele_usn;

	@FindBy(name = "user_password")
	private WebElement ele_pwd;

	@FindAll({@FindBy(id = "submitButton"),@FindBy(xpath = "//input[@value='Login']")})
	private WebElement loginbtn;

	// getters
     //object encapsulation
	public WebElement getEle_usn() {
		return ele_usn;
	}

	public WebElement getEle_pwd() {
		return ele_pwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	
	//provide action
	/**
	 * login to application based on user name, password, url arguments 
	 * @param url
	 * @param username
	 * @param password
	 **/
	public void loginToApp(String url,String username,String password)
	{
		driver.get(url);
		ele_usn.sendKeys(username);
		ele_pwd.sendKeys(password);
		loginbtn.click();
	}

}
