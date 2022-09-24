package com.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BasePage(){
		
		Properties prop;
		
		try {
			FileInputStream fs = new FileInputStream("src/main/java/com/qa/resources/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
