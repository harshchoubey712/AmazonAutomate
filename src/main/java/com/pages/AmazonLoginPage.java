package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
	// 1. By Locators: OR
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?111");

	// 2. Constructor of the page class:
	public AmazonLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new AccountsPage(driver);
	}
*/
public class AmazonLoginPage {

	private WebDriver driver;
	// 1. By Locators: OR
	private By LandindpageSigininpresenece = By.xpath("//a[contains(.,'Hello, Sign in')]");
	private By emailtextpresence = By.xpath("//label[normalize-space()='Email or mobile phone number']");
	private By emailId = By.xpath("//input[@id='ap_email']");
	private By password = By.xpath("//input[@id='ap_password']");
	private By Sigininsubmit = By.xpath("//input[@id='signInSubmit']");
	private By ContinueButton = By.xpath("//input[@id='continue']");

	private By HomepageSigninpresence = By.xpath("//span[normalize-space()='Hello, Harsh']");

	// span[normalize-space()='Hello, Harsh']

	// 2. Constructor of the page class:
	public AmazonLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean checksigninbutton() {
		return driver.findElement(LandindpageSigininpresenece).isDisplayed();
	}

	public void clickOnSignin() {
		// TODO Auto-generated method stub
		driver.findElement(LandindpageSigininpresenece).click();

	}

	public boolean checkemail() {
		// TODO Auto-generated method stub

		return driver.findElement(emailtextpresence).isDisplayed();

	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void clickOnContinue() {
		driver.findElement(ContinueButton).click();

	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);

	}

	public void clickOnSigninsubmit() {
		// TODO Auto-generated method stub
		driver.findElement(Sigininsubmit).click();
	}

	public boolean checkHomePage() {
		return driver.findElement(HomepageSigninpresence).isDisplayed();
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public AmazonHomePage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(LandindpageSigininpresenece).click();
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(ContinueButton).click();
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(Sigininsubmit).click();
		return new AmazonHomePage(driver);
	}
}
