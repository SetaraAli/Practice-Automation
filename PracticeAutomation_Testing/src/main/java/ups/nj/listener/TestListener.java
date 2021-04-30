package ups.nj.listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ups.nj.utility.CommonUtility;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("I  am in onStart method  :"+ result.getName());	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("I am in onTestSuccess: " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("I am in onTestFailure: " + result.getName());
		try {
			CommonUtility.getScreenShot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
