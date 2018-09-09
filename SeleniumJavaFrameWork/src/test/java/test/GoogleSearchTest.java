package test;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();

	}
	public static void googleSearch(){
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		GoogleSearchPage.textbox_Search(driver).sendKeys("Automatation step By step");;
		
	
	//driver.findElement(By.name("btnK")).click();
	//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
	driver.close();
	System.out.println("Test completed sucessfully");
		
	}

}
