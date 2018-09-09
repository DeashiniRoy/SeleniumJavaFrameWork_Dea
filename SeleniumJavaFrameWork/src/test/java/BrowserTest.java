import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		String projectPath= System.getProperty("user.dir");
		//System.out.print(projectPath);
//		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\selinium_auto_workspace\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//System.setProperty("webdriver.ie.driver",projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
	//	driver.get("https://www.seleniumhq.org/");
		
		driver.get("https://www.google.com/");
        //WebElement textBox = driver.findElement(By.id("lst-ib"));
        WebElement textBox = driver.findElement(By.xpath("//input[@id ='lst-ib']"));
        List<WebElement> listOfElement= driver.findElements(By.xpath("//input"));
        int count = listOfElement.size();
        System.out.println("Count is :"+count);
        textBox.sendKeys("Automation step by step");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
