package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_utility {
	
	
	
	public static ExtentReports Extentrep() {
		
	String path = "C:\\Users\\praveen.a.muthusamy\\eclipse-workspace\\Automation\\Reports\\index.html";
	ExtentSparkReporter x = new ExtentSparkReporter(path);
	x.config().setReportName("My First Report");
	x.config().setDocumentTitle("My first log");
	ExtentReports Extent = new ExtentReports();
	Extent.attachReporter(x);
	return Extent;
	}
}
