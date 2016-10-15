package com.uy.livenation.tools.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{

	//-------------------------------
	//ATTRIBUTES
	//-------------------------------
	@FindBy(how=How.NAME, using="user_name")
	private WebElement txtUsername;
	
	@FindBy(how=How.NAME, using="password")
	private WebElement txtPassword;
	
	@FindBy(how=How.NAME, using="Submit")
	private WebElement btnLogin;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Forgot your password")
	private WebElement lnkForgotPassword;
	
	
	//-------------------------------
	//CONSTRUCTORS
	//-------------------------------
	/**
	 * Page Constructor
	 * @param driver
	 */
	public LoginPage(WebDriver driver){
		
		super(driver);
		
	}
	
	
	//------------------------------------
	//FUNCTIONS
	//------------------------------------
	/**
	 * Method to login into the system
	 * @param username - (String) username
	 * @param password - (String) password
	 */
	 public void login(String username, String password){
			
		 System.out.println("Providing username");
		 this.txtUsername.clear();
		 this.txtUsername.sendKeys(username);
			
		 System.out.println("Providing password");
		 this.txtPassword.clear();
		 this.txtPassword.sendKeys(password);
			
		 System.out.println("Clicking on login button");
		 this.btnLogin.click();
			
	}
	 
	/**
	 * Method to navigate to the Forgot Password page
	 */
	 public void navigateToForgotPasswordPage(){
		 
		 this.lnkForgotPassword.click();
		 
	 }
	 
}