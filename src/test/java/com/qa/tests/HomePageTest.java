package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;

public class HomePageTest extends BasePage {
	
	@Test
	public void googleLaunchTest(){
		driver.get(url);
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void googleSearchTest(){
		driver.get(url);
		System.out.println(driver.getTitle());
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("India");
		WebElement btnSearch = driver.findElement(By.name("btnK"));
		btnSearch.click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//txtSearch.submit();	
	}
}
