package org.test.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class testwithextent {
	WebDriver driver;
	ExtentReports Extent;
	ExtentSparkReporter Spark;
	ExtentTest test;
	SoftAssert soft;
	
	
	@Test
	
	public void TC001_FBLogin() {
		
			soft= new SoftAssert();
			Spark=new ExtentSparkReporter("file:///C:/Users/Admin/eclipse-workspace/Maven%20project/Mavenproject/Reports/Extent.html");
		
		Spark.config().setDocumentTitle("Automation Reporting test");
		Spark.config().setReportName("ExtentReport1");
		Spark.config().setTheme(Theme.STANDARD);
		
		Extent= new ExtentReports();
		Extent.attachReporter(Spark);
		
		
		test=Extent.createTest("TC001_FBLogin");{
			test.info("Launching the Browser-------");{
				driver=new ChromeDriver();
				
				
				
				test.info("Loading the URL------");
				driver.get("https;//www.Google.com/");
				
				
				soft.assertEquals(driver.getTitle(),("Google2"));
			
				//if(driver.getTitle
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}


		
		
		
	}
	
	

}
