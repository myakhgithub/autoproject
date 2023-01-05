package Listener;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listnersclass implements ITestListener {
	ExtentTest test;

	ExtentReports er;
	public void onTestStart(ITestResult result) {
		String name=result.getName();
		test = er.createTest(name);
	}

	public void onTestSuccess(ITestResult result) {
		
		String name=result.getName();
		test.log(Status.PASS, name + "----->pass");
		
	}

	public void onTestFailure(ITestResult result) {
		
		String name=result.getName();
		test.log(Status.FAIL,name + "----->pass");
		
		
		//TakesScreenshot sh = ()
		
	}

	public void onTestSkipped(ITestResult result) {
	
		String name=result.getName();
		test.log(Status.SKIP,name + "----->skipped");
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\ExtentSparkReporter"+9+".html");
		
		esr.config().setDocumentTitle("Final Vtiger report");
		
		esr.config().setTheme(Theme.DARK);
		
		esr.config().setReportName("AKH");
		
		er= new ExtentReports();
		
		er.attachReporter(esr);
		
		er.setSystemInfo("Operating System", "Windows");
		
		 er.setSystemInfo("Language", "Java");
		
		
		
	}
	
	
	public void onFinish(ITestContext context) {
		er.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
