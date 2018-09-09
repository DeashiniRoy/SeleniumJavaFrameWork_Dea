package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.RectangleSize;


public class AppliToolsDemo {

	public static void main(String[] args) {
		// Open a Chrome browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DR040553\\git\\SeleniumJavaFrameWork_Dea\\SeleniumJavaFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Initialize the eyes SDK and set your private API key.
		Eyes eyes = new Eyes();

		eyes.setApiKey("1q81ZwxAt2Uj75cJSVg0xdyOOIX109ddM6XsZGLEr106vM4110");

		try{

			// Start the test and set the browser's viewport size to 800x600.
			eyes.open(driver, "Hello World!", "My first Selenium Java test!",
					new RectangleSize(800, 600));

			// Navigate the browser to the "hello world!" web-site.
			//driver.get("https://applitools.com/helloworld");
			//driver.get("https://applitools.com/helloworld?diff1");
			driver.get("https://applitools.com/helloworld?diff2");
			// Visual checkpoint #1.
			eyes.checkWindow("Hello!");

			// Click the "Click me!" button.
			driver.findElement(By.tagName("button")).click();

			// Visual checkpoint #2.
			eyes.checkWindow("Click!");

			// End the test.
			eyes.close();

		} finally {

			// Close the browser.
			driver.quit();

			// If the test was aborted before eyes.close was called, ends the test as aborted.
			eyes.abortIfNotClosed();
		}

	}


}
