package com.uy.livenation.tools;

import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends AbstractStep{
	
	//-------------------------------
	//STEP FUNCTIONS
	//-------------------------------
	
	//-----------------------
	//GIVEN
	//-----------------------
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
	    
		this.initialize();
		driver.get("http://tools.tmol.dev44.websys.tmcs/");
		
	}
	
	@And("^User clicks on the Forgot your password link$")
	public void user_clicks_on_the_Forgot_your_password_link()throws Throwable {
		
		this.loginPage.navigateToForgotPasswordPage();
		
	}
	
	
	//-----------------------
	//WHEN
	//-----------------------
	@When("^User enters valid UserName and Password$")
	public void user_enters_valid_UserName_and_Password() throws Throwable {
		
		loginPage.login("yreyes", "Monday1259433");
		
	}
	
	@When("^User enters invalid UserName and/or Password$")
	public void user_enters_invalid_UserName_and_or_Password() throws Throwable {
	    
		this.loginPage.login("yreyes", "Monday1259433111");
		
	}
	
	@When("^User requests password providing an invalid username$")
	public void user_requests_password_providing_an_invalid_username() throws Throwable{
		
		this.forgotPasswordPage.requestPassword("jgerardTest");
		
	}
	
	
	//-----------------------
	//THEN
	//-----------------------
	@Then("^User is presented in the Home Page$")
	public void user_is_presented_in_the_Home_Page() throws Throwable {
		
		System.out.println("Checking that we are in Home page");
		Assert.assertEquals(driver.getTitle(), this.homePage.getPageTitle());
		
	}
	
	@Then("^User is presented in the Login Page$")
	public void user_is_presented_in_the_Login_Page() throws Throwable {
	 
		System.out.println("Checking that we are in Login page");
		Assert.assertEquals(driver.getTitle(), this.homePage.getPageTitle());
		
	}
	
	@And("^Invalid credentials error message is displayed$")
	public void invalid_credentials_error_message_is_displayed() throws Throwable {
		
		System.out.println("Checking that invalid credentials error message is displayed");
		Assert.assertTrue(this.loginPage.checkResult("ERROR: the username/password combination"));
		
	}
	
	@Then("^User is presented in the Forgot Password Page$")
	public void user_is_presented_in_the_Forgot_Password_Page() throws Throwable{
		
		System.out.println("Checking that we are in Forgot Password page");
		Assert.assertEquals(driver.getTitle(), this.forgotPasswordPage.getPageTitle());
		
	}
	
	@And("^Invalid username error message is displayed$")
	public void invalid_username_error_message_is_displayed() throws Throwable{
		
		System.out.println("Checking that invalid username error message is displayed");
		boolean x = this.forgotPasswordPage.checkResult("ERROR: You user name you have entered doesn't have a valid configuration. Please contact your administrator to properly configure your account.");
		Assert.assertTrue(this.forgotPasswordPage.checkResult("ERROR: You user name you have entered doesn't have a valid configuration. Please contact your administrator to properly configure your account."));
		
	}
}