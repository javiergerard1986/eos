package com.uy.livenation.tools.eos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static WebDriver driver;
	
	public static void main( String[] args )
    {
        
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
    }
}
