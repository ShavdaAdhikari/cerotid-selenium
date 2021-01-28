package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	public static void main(String[] args) {
		
		
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport.html");
		

		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1=extent.createTest("Google");
		
		
		
		
		
		
	}

}
