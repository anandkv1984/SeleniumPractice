package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;

public class HomePageTest extends BasePage {
	
	@Test
	public void googleLaunchTest(){
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
