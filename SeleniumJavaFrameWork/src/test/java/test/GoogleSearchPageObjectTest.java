package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageObjectTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearchPageTest();
		
	}
	public static void googleSearchPageTest(){
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com/");
		searchPageObj.setTextInSearchBox("ABCD");
		searchPageObj.clickSearchButton();
		driver.close();
		
		
	}
}
