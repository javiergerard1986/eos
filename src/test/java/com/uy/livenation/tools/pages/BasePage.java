package com.uy.livenation.tools.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	//-------------------------------
	//ATTRIBUTES
	//-------------------------------
	protected WebDriver driver;
	
	
	//-------------------------------
	//CONSTRUCTOR
	//-------------------------------
	public BasePage (WebDriver driver){
		
		this.driver = driver;
		
	}
	
	
	//-------------------------------
	//FUNCTIONS
	//-------------------------------	
	/**
	 * Method to validate results 
	 * @param textToValidate - (String) This is the text that we will validate that is in page
	 */
	public boolean checkResult(String textToValidate){ 

		try{
			
			WebElement bodyTag = driver.findElement(By.tagName("body")); 
			
			if (bodyTag.getText().contains(textToValidate)){ 
			
				return true; 
			
			} 
			
		}catch(Exception ex){
			
			System.out.println(ex.getMessage());
			
		}
		
		return false;

	}
	
	/**
	 * Function to return the page title
	 */
	public String getPageTitle(){
		
		return this.driver.getTitle();
		
	}

}