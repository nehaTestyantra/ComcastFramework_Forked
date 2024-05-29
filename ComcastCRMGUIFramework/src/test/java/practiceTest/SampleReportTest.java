package practiceTest;

import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.basetest.BaseClass;

public class SampleReportTest {

//	public ExtentReports report;
//	@BeforeSuite
//	public void configBS() {
//		//spark report config
//				ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReport/report.html");
//				spark.config().setDocumentTitle("CRM Test Suite Result");
//				spark.config().setReportName("CRM Report");
//				spark.config().setTheme(Theme.DARK);
//				
//				//add environment informstion and create test
//				 report= new ExtentReports();
//				report.attachReporter(spark);
//				report.setSystemInfo("OS", "Windows 11");
//				report.setSystemInfo("browser","chrome");
//	}
//	 @AfterSuite
//	 public void configAS() {
//			report.flush();
//
//	 }
//	
//	
//	@Test
//	public void createContactTest() {
//		WebDriver driver= new ChromeDriver();
//		driver.get("http://localhost:8888");
//		
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		String filePath = ts.getScreenshotAs(OutputType.BASE64);
//		
//		ExtentTest test = report.createTest("createContactTest");
//		test.log(Status.INFO,"login to app");
//		test.log(Status.INFO,"navigate to contact page");
//		test.log(Status.INFO,"create contact");
//		if("HDF".equals("HDFC")) {
//			test.log(Status.PASS,"contact is created");
//		}else {
//			test.addScreenCaptureFromBase64String(filePath,"ErrorFile");
//		}
//		}
}
