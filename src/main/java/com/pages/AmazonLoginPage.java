package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
Git Steps for pushing:

cd /Users/harshchoubey/eclipse-workspace/AmazonAutomate
git init 
git remote add origin "https://github.com/harshchoubey712/AmazonAutomate.git"
gives repos already exists
git remote --verbose 
git remote set-url origin  https://github.com/harshchoubey712/AmazonAutomate.git
git remote --verbose 
git status 
git add .  
git commit -m "added amazon files to push" 
git push origin master  
 
 check the changes in remote rep.
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
