package com.uy.livenation.tools.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPage extends BasePage{

	//-------------------------------
	//ATTRIBUTES
	//-------------------------------
	@FindBy(how=How.NAME, using="user_name")
	private WebElement txtUsername;
	
	@FindBy(how=How.NAME, using="Submit")
	private WebElement btnSubmit;
	
	
	//-------------------------------
	//CONSTRUCTORS
	//-------------------------------
	/**
	 * Page Constructor
	 * @param driver
	 */
	public ForgotPasswordPage(WebDriver driver){
		
		super(driver);
		
	}
	
	
	//------------------------------------
	//FUNCTIONS
	//------------------------------------
	/**
	 * Method to login into the system
	 * @param username - (String) username
	 */
	 public void requestPassword(String username){
			
		 System.out.println("Providing username");
		 this.txtUsername.clear();
		 this.txtUsername.sendKeys(username);
			
		 System.out.println("Clicking on submit button");
		 this.btnSubmit.click();
		 
	}

}