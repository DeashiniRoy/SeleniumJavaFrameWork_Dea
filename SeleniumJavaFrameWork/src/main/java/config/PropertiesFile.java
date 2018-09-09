package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Test1_GoogleSearch_TESTNG_Demo;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectPath=System.getProperty("user.dir");
	public static void main(String[] args) {
		try {
			getProperties();
			setProperties();
			getProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getProperties() throws IOException{


		InputStream input = new FileInputStream(projectPath+"\\src\\main\\java\\config\\config.properties");
		prop.load(input);
		String  browser =prop.getProperty("browser");
		System.out.println(browser);
		Test1_GoogleSearch_TESTNG_Demo.browsername = browser;
	}

	public static void setProperties(){
		try {
			OutputStream output = new FileOutputStream(projectPath+"\\src\\main\\java\\config\\config.properties");
			//prop.setProperty("browser", "chrome");
			prop.setProperty("result", "pass");//to set the result in  config.properties
			prop.store(output, null);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
