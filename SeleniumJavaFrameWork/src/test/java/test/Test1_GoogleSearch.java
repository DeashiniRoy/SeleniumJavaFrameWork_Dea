package test;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();

	}
	public static void googleSearch(){
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Automation step by step");
	//driver.findElement(By.name("btnK")).click();
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	driver.close();
	System.out.println("Test completed sucessfully");
		
	}

}
