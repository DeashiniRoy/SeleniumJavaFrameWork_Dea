package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {

	public static void main(String[] args) {
		seleniumWaits();
	}
	public static void seleniumWaits(){
		 System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//syntax of implicit wait
		   driver.get("https://google.com");
		   driver.findElement(By.xpath("//input[@id ='lst-ib']")).sendKeys("Automation");
		   driver.findElement(By.name("btnK")).click();
		   
		   WebDriverWait wait = new WebDriverWait(driver, 10);// syntax for explicit wait
		   wait.until(ExpectedConditions.elementToBeClickable(By.name("abcde")));//syntax for explicit wait
		  // driver.findElement(By.name("abcd")).click();// test for implicit wait
		   driver.close();
		   driver.quit();
		   
	}
}
