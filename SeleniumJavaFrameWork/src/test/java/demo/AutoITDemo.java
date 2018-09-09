package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		Test();
	}
	public static void Test() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		//Calling AutoIt  script in  Selenium test.
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		Thread.sleep(3000);
		//driver.close();
	}

}
