package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;



public class SeleniumFluentWaitDemo {
	
	public static void main(String[] args) throws Exception {
		fluetWaitTest();
	}

	public static void fluetWaitTest() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://google.com");
		   driver.findElement(By.xpath("//input[@id ='lst-ib']")).sendKeys("ABCD");
		  // driver.findElement(By.linkText("About ABCD - Nurture Development")).click();
		   @SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(2,TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
		   
		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			    	 WebElement linkelement= driver.findElement(By.linkText("About ABCD - Nurture Development"));
			    	 
			    	 if (linkelement.isEnabled()){
			    		 System.out.println("Element found");
			    		 
			    	 }
			    	 return linkelement;
			     }
			   });
		   element.click();
		   Thread.sleep(4000);
		   driver.close();
		   driver.quit();
		
	}
}
