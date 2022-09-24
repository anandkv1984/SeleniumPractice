package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest {
	
	@Test
	public void googleLaunchTest(){
		
		WebDriver driver;
		System.setProperty("windows.chrome.driver","drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
	}

}
