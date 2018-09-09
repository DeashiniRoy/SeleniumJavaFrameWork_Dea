package test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;

public class Test1_GoogleSearch_TESTNG_Demo {
	static Logger logger = LogManager.getLogger(Log4jDemo.class);

	WebDriver driver = null;
	public static String browsername = null;
	@BeforeTest
	public void setUpTest(){
		String projectPath=System.getProperty("user.dir");
		try {
			PropertiesFile.getProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		logger.info("Browser started");

	}
	@Test
	public  void googleSearch(){
		driver.get("https://www.google.com/");	
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);


	}

	@AfterTest
	public void tearDownTest(){
		driver.close();
		driver.quit();
		System.out.println("Test completed sucessfully");
		PropertiesFile.setProperties();

	}

}
