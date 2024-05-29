package com.comcast.crm.orgtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.listenerutility.ListImpClass;
import com.comcast.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcast.crm.objectrepositoryutility.HomePage;

//@Listeners(com.comcast.crm.listenerutility.ListImpClass.class)
public class CreateOrganization extends BaseClass {

	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException, InterruptedException {
		
		// wLib.waitForPageToLoad(driver);
		// UtilityClassObject.getTest().log(Status.INFO,"read data from excel");
		String orgName = eLib.getDataFromExcel("org", 1, 2) + jLib.getRandomNumber();
		HomePage hp = new HomePage(driver);
		// ListImpClass.test.log(Status.INFO,"navigate to org page");

		hp.getOrgLink().click();

		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.getNewOrgBtn().click();
		// ListImpClass.test.log(Status.INFO,"navigate to cfrete org page");

		cnop.createOrg(orgName);
		Thread.sleep(2000);
		// ListImpClass.test.log(Status.INFO,"create org");

	}

	@Test

	public void createOrgWithIndustry() throws EncryptedDocumentException, IOException, InterruptedException {
		wLib.waitForPageToLoad(driver);

		String orgName = eLib.getDataFromExcel("org", 4, 2) + jLib.getRandomNumber();
		String industry = eLib.getDataFromExcel("org", 4, 3);
		String type = eLib.getDataFromExcel("org", 4, 4);

		// click on organization link in the home page
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// click on create new organization button
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.getNewOrgBtn().click();

		// enter details to create new organization
		cnop.getOrgNameEdt().sendKeys(orgName);
		cnop.getIndustrydd().click();
		cnop.selectIndustry(industry);
		cnop.selectAccountType(type);

		cnop.getSaveBtn().click();
		Thread.sleep(2000);

	}

	@Test
	public void CreateOrgWithPhoneNumber() throws EncryptedDocumentException, IOException, InterruptedException {
		wLib.waitForPageToLoad(driver);

		String orgName = eLib.getDataFromExcel("org", 7, 2) + jLib.getRandomNumber();
		String phonenum = eLib.getDataFromExcel("org", 7, 3);

		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.getNewOrgBtn().click();
		Thread.sleep(2000);

		cnop.getOrgNameEdt().sendKeys(orgName);
		cnop.getPhone().sendKeys(phonenum);
		cnop.getSaveBtn().click();
		Thread.sleep(2000);

	}
}
