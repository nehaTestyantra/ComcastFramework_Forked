package practiceTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;



public class InvoiceTest extends BaseClass{

	@Test(/*retryAnalyzer = com.comcast.crm.listenerutility.RetryListenerImp.class*/)
	public void createInvoiceTest()
	{
		System.out.println("executed InvoiceTest");
		
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
	}
	
	@Test(/*retryAnalyzer = com.comcast.crm.listenerutility.RetryListenerImp.class*/)
	public void createInvoiceTestwithContact()
	{
		System.out.println("executed InvoiceTestwithContact");
		String actTitle= driver.getTitle();
		Assert.assertEquals(actTitle,"Login");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
	}
}
