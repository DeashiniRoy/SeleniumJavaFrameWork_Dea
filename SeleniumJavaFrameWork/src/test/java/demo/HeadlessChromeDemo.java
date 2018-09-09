package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		Test();
	}

	public static void Test(){
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id ='lst-ib']")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).click();
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
	}
}
