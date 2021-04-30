package ups.nj.listener;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting extends TestListenerAdapter{
	public ExtentHtmlReporter htmlreport;
	public ExtentReports Extent;
	public ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		String timeStam = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName ="report" + timeStam +".html";
		
		htmlreport = new ExtentHtmlReporter(System.getProperty("user.dir") +"/ExtentReports/" + repName);
		htmlreport.loadXMLConfig(System.getProperty("user.dir") +"extent-config.xml");
    }
	public void onSuccess(ITestResult result) {
		
	}
	public void onFailure(ITestResult result) {
		
	}		
	
	public void onTestSkipped(ITestResult result) {
		
	}
	public void onFinish(ITestContext context) {
		
	}
	
	}