package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {

	//	public static void main(String[] args) {
	//		String projectPath = System.getProperty("user.dir");
	//		
	//		testData(projectPath+"\\excel\\data.xlsx", "Sheet1");
	//	}
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest(){
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		

	

	@Test(dataProvider ="testData" )
	
	public void test1(String username, String password) throws Exception{
		System.out.println("Usename->"+username +"|" +"Password.>"+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		
	}
	@DataProvider(name = "testData")
	public  Object[][] getData(){
		String excelPath = System.getProperty("user.dir");

		Object data[][]=testData(excelPath+"\\excel\\data.xlsx", "Sheet1");
		return data;

	}
	public  Object[][] testData(String excelPath, String sheetName){

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount =excel.getRowCount();
		int colCount =excel.getColCount();

		Object data [][] = new Object [rowCount-1][colCount];

		for(int i= 1 ; i<rowCount ; i++){
			for (int j=0 ;j<colCount ; j++){
				String cellData= excel.getCellDataString(i, j);
				System.out.print(cellData+"  |  ");
				data[i-1][j]= cellData;
			}
			System.out.println();
		}
		return  data;
	}
}
