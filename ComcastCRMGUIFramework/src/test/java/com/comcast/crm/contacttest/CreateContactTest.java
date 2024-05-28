package com.comcast.crm.contacttest;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.ContactInfoPage;
import com.comcast.crm.objectrepositoryutility.ContactPage;
import com.comcast.crm.objectrepositoryutility.CreateContactWithOrgPage;
import com.comcast.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.OrganizationPage;

public class CreateContactTest extends BaseClass {
	@Test(groups = "Smoke Testcase")
	public void createContactTest() throws EncryptedDocumentException, IOException, InterruptedException {
		String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();

		// step1: login to app
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();

		ContactPage cp = new ContactPage(driver);
		cp.getCreateContactBtn().click();
		cp.getLastnameTextfield().sendKeys(lastName);

		cp.getSaveBtn().click();
		Thread.sleep(2000);

		// verify header orgName Expected result
		String actHeader = cp.getHeadermsg().getText();
		boolean status = actHeader.contains(lastName);
		org.testng.Assert.assertEquals(status, true);

		ContactInfoPage cip = new ContactInfoPage(driver);
		String lname = cip.getInfo(driver);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actHeader, lname);
	}

	@Test
	public void CreateContactWithOrganization() throws IOException, InterruptedException {

		String orgName = eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNumber();
		System.out.println(orgName);
		String contactLastname = eLib.getDataFromExcel("contact", 7, 3);

		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateOrg().click();

		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createOrg(orgName);

		Thread.sleep(2000);
		hp.contactLink();
		CreateContactWithOrgPage ccwo = new CreateContactWithOrgPage(driver);
		ccwo.getContactLink().click();
		ccwo.getCreatContactBtn().click();
		ccwo.getLastNametf().sendKeys(contactLastname);
		ccwo.getSelectOrgBtn().click();
		ccwo.switchToChild();
		ccwo.getSearchtf().sendKeys(orgName);
		ccwo.getSearchbtn().click();
		// Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='" + orgName + "']"));
		System.out.println(ele.getText());
		ele.click();

		ccwo.switchBack();
		ccwo.getSaveBtn().click();
		Thread.sleep(2000);
//		hp.getAdminImg();
//		hp.getSignOutbtn().click();
//		driver.quit();
	}

	@Test
	public void ccwsupportdate() throws EncryptedDocumentException, IOException, InterruptedException {
		String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();

		// step1: login to app
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();

		ContactPage cp = new ContactPage(driver);
//		cp.getCreateContactBtn().click();
//		cp.createContact(lastName);

//		Actions act = new Actions(driver);
//		act.scrollToElement(cp.getStartDate());

		String endDate = jLib.getSystemDateYYYYMMDD();
		String startDate = jLib.getRequiredDateYYYYMMDD(30);
		cp.createContactWithSupportDate(lastName, startDate, endDate);

		Thread.sleep(2000);
//		cp.getStartDate().sendKeys(startDate);
//		cp.getEndDate().sendKeys(endDate);

		cp.getSaveBtn().click();
		Thread.sleep(2000);
//		hp.getAdminImg();
//		hp.getSignOutbtn().click();

	}

}
