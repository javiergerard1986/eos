package com.uy.livenation.tools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksTest {

	//------------------------------------
	//ATTRIBUTES
	//------------------------------------
	private static WebDriver firefoxDriver;


	//------------------------------------
	//ATTRIBUTES
	//------------------------------------
	public static WebDriver getFirefoxDriver() {
		return firefoxDriver;
	}

	
	//------------------------------------
	//METHODS AND FUNCTIONS
	//------------------------------------
	/**
	 * Method to initialize browser
	 */
	@Before
	public void initializeFireFoxBrowser(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		HooksTest.firefoxDriver = new FirefoxDriver();
		
		firefoxDriver.manage().window().maximize();
		firefoxDriver.manage().deleteAllCookies();
		firefoxDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	}

	/**
	 * Method to close browser
	 */
	@After
	public void closebrowser(){
		
		firefoxDriver.quit();	
	
	}
	
}