package com.uy.livenation.tools.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{

	//-------------------------------
	//ATTRIBUTES
	//-------------------------------
	@FindBy(how=How.LINK_TEXT, using="Offering Tool")
	private WebElement lnkOfferingTool;
	
	
	//-------------------------------
	//CONSTRUCTORS
	//-------------------------------
	/**
	 * Page Constructor
	 * @param driver
	 */
	public HomePage(WebDriver driver){
		
		super(driver);
		
	}
	
	
	//------------------------------------
	//FUNCTIONS
	//------------------------------------
	/**
	 * Method to navigate into the "Offering Tool Main" page
	 */
	 public void navigateToOfferingToolMainPage(){
			
		 System.out.println("Clicking on the Offering Tool link");
		 this.lnkOfferingTool.click();
			
	 }
	 
}