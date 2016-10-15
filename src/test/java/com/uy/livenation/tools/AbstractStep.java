package com.uy.livenation.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.uy.livenation.tools.pages.ForgotPasswordPage;
import com.uy.livenation.tools.pages.HomePage;
import com.uy.livenation.tools.pages.LoginPage;
import com.uy.livenation.tools.pages.OfferingToolMainPage;

public class AbstractStep {

	//-------------------------------
	//ATTRIBUTES
	//-------------------------------
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected ForgotPasswordPage forgotPasswordPage;
	protected HomePage homePage;
	protected OfferingToolMainPage offeringToolMainPage;
	
	
	//-----------------------
	//OTHERS
	//-----------------------
	/**
	 * Method to initialize environment
	 */
	public void initialize(){
	
		this.driver = HooksTest.getFirefoxDriver();	
		this.initializeAppPages();
		
	}
	
	/**
	 * Method to initialize application pages
	 */
	public void initializeAppPages(){
		
		this.loginPage = PageFactory.initElements(driver, LoginPage.class);
		this.forgotPasswordPage = PageFactory.initElements(driver, ForgotPasswordPage.class);
		this.homePage = PageFactory.initElements(driver, HomePage.class);
		this.offeringToolMainPage = PageFactory.initElements(driver, OfferingToolMainPage.class);
		
	}
	
}