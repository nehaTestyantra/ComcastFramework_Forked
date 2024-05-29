package com.comcast.crm.listenerutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;

public class ListImpClass implements ITestListener, ISuiteListener {
    public ExtentSparkReporter spark;
    public static ExtentReports report;
	public static ExtentTest test;
	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report config");
		String time= new Date().toString().replace(" ", "_").replace(":", "_");

		//spark report config
		ExtentSparkReporter spark= new ExtentSparkReporter("./AdvanceReport/report"+time+".html");
		spark.config().setDocumentTitle("CRM Test Suite Result");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		
		//add environment information and create test
		 report= new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("browser","chrome");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("----------"+ result.getMethod().getMethodName()+"----------");
		 test = report.createTest(result.getMethod().getMethodName());
		 Reporter.log(result.getMethod().getMethodName()+" --> execution starts");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName+"-- PAssed");
		Reporter.log(MethodName+"-- Passed");
	}

	@Override 
	public void onTestFailure(ITestResult result){
		String testname= result.getMethod().getMethodName();
		TakesScreenshot ts= (TakesScreenshot)BaseClass.sdriver;
		String filePath = ts.getScreenshotAs(OutputType.BASE64);
		String time= new Date().toString().replace(" ", "_").replace(":", "_");
	    test.addScreenCaptureFromBase64String(filePath,testname+" "+time);
	    test.log(Status.FAIL, result.getMethod().getMethodName()+"==>FAILED<==");
	    
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName+" --> Skipped");
		test.log(Status.SKIP, result.getThrowable());
		}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	
}
