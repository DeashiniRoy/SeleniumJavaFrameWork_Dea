package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasic_Demo {

	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("Google Search Test", "This is to validate Google seach functionality");

		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");

		driver =new ChromeDriver();
		test.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.google.com/");
		test.pass("Navigated to  Google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("entered text  in search box");

		driver.findElement(By.name("btnK")).click();
		test.pass("Button is clicked");
		driver.close();
		driver.quit();
		test.pass("Closed the brwoser");
		test.info("test completed");
		
		ExtentTest test1 = extent.createTest("Google Search Test One", "This is to validate Google seach functionality");

		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");

		driver =new ChromeDriver();
		test1.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.google.com/");
		test1.pass("Navigated to  Google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.fail("entered text  in search box");

		driver.findElement(By.name("btnK")).click();
		test1.pass("Button is clicked");
		driver.close();
		driver.quit();
		test1.pass("Closed the brwoser");
		test1.info("test completed");
	
	
		
		// calling flush writes everything to the log file
        extent.flush();

	}

}
