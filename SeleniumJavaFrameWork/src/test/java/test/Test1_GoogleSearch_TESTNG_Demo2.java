package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_GoogleSearch_TESTNG_Demo2 {

	WebDriver driver = null;
	@BeforeTest
	public void setUpTest(){
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		 driver =new ChromeDriver();
		
	}
	@Test
	public  void googleSearch2(){
	driver.get("https://www.google.com/");	
	driver.findElement(By.name("q")).sendKeys("Automation step by step");
	//driver.findElement(By.name("btnK")).click();
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
		
	}
	@Test
	public  void googleSearch3(){
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
		
	}

}
