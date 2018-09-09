package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG {
	ExtentHtmlReporter htmlReporter ;
	ExtentReports extent ;

	static WebDriver driver = null;
	@BeforeSuite
	public void setUpTest(){
		htmlReporter=	new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);



	}
	@BeforeTest
	public  void beforeTest(){
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
	}

	@Test
	public void test1() throws Exception{

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("MyFirstExtentReportDemoWithTestNG ", "This is to validate Google seach functionality");
		driver.get("https://www.google.com/");
		test.pass("Navigated to  Google.com");
		// log(Status, details)
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("entered text  in search box");
		
		driver.findElement(By.name("btnK")).click();
		test.pass("Button is clicked");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

	}

	@Test
	public void test2() throws Exception{
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("MyFirstExtentReportDemoWithTestNG ", "This is to validate Google seach functionality");
		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

	}
	@AfterTest
	public void afterTest(){
		driver.close();
		driver.quit();
	}


	@AfterSuite
	public void tearDownTest(){

		// calling flush writes everything to the log file
		extent.flush();


	}

}
