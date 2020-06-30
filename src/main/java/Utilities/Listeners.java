package Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listeners implements ITestListener

{
	ExtentReports Extent = Extent_utility.Extentrep();
	ExtentTest Test;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		Extent.flush();
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailure(ITestResult Result) {
		// TODO Auto-generated method stub
		Test.fail(Result.getThrowable());
		try {
			String name1  =Result.getMethod().getMethodName();
			Reusable.Screen(Result.getMethod().getMethodName());
			Test.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\scrennshots\\"+name1+".png", Result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub
		Test = Extent.createTest(Result.getMethod().getMethodName());
	}


	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}

