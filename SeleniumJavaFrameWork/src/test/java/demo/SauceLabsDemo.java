package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {
	
	public static final String USERNAME = "DeashiniRoy";
	  public static final String ACCESS_KEY = "88b8e76c-5d38-411d-8297-3c5c6e917106";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "latest");
	    caps.setCapability("name","GoogleTeats1");
	    caps.setCapability("extendedDebugging"," true");
	    
	
	 
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	 
	    /**
	     * Goes to Sauce Lab's guinea-pig page and prints title
	     */
	    driver.get("https://google.com/");
	   // driver.get("https://saucelabs.com/test/guinea-pig");
	    System.out.println("title of page is: " + driver.getTitle());
	    
	    driver.findElement(By.name("q")).sendKeys("Automamtion");
	    driver.findElement(By.name("btnK")).click();
	    System.out.println(driver.getTitle());
	    driver.quit();
	    System.out.println("test completed");

}
}
