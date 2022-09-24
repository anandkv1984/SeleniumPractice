package com.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String url;
	public static String browser;
	
	public BasePage(){
		
		Properties prop = new Properties();
		FileInputStream fs = null;
		
		try {
			fs = new FileInputStream("src/main/java/com/qa/resources/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			prop.load(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url=prop.getProperty("url");
		browser = prop.getProperty("browser");
		
	}
	
	@BeforeMethod
	public void setup(){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		} else{
			System.out.println("******* Invald browser ********");
		}
		
	}
	
	@AfterMethod
	public void testDown(){
		driver.quit();
	}
	


}
