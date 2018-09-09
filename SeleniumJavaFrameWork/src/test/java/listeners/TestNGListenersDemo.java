package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners({listeners.TestNGListeners.class})
public class TestNGListenersDemo {
	
	@Test
	public void test1(){
		System.out.println("I am inside test1");
	}
	@Test
	public void test2(){
		System.out.println("I am inside test2");
		//Assert.assertTrue(false);
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@id ='lst-ib']")).sendKeys("Automation step by step");
		//driver.findElement(By.xpath("//input[@id ='lst-ij']")).sendKeys("Automation step by step");//   failed by  changing the id
		driver.close();
		
	}
	@Test
	public void test3(){
		System.out.println("I am inside test3");
		throw new SkipException("This test is skipped");
	}

}
