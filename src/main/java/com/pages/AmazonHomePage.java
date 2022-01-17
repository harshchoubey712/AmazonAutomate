package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*

public class AccountsPage {

	private WebDriver driver;

	private By accountSections = By.cssSelector("div#center_column span");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public int getAccountsSectionCount() {
		return driver.findElements(accountSections).size();
	}

	public List<String> getAccountsSectionsList() {

		List<String> accountsList = new ArrayList<>();
		List<WebElement> accountsHeaderList = driver.findElements(accountSections);

		for (WebElement e : accountsHeaderList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}

		return accountsList;

	}

}
*/


public class AmazonHomePage {

	
	

	private  WebDriver driver;
	
	// 1. By Locators: OR
	private By searchbuttoncheck=By.xpath("//input[@name='field-keywords']");
	private By usernamecheck=By.xpath("//span[normalize-space()='Hello, Harsh']");
	private By logocheck=By.xpath("//a[@aria-label='Amazon'bb]");
	private By cartcheck=By.xpath("//span[normalize-space()='2']");


	
	private By clickonAccountsLists=By.xpath("//span[normalize-space()='Account & Lists']");
	
	private By clickonYourOrders=By.xpath("//div[@data-card-identifier='YourOrders']//div//div//div//h2");
	
	private By clickonPastOrders=By.xpath("//li[@role='tab']//span//span");
	
	private By clickonCancelledOrders=By.xpath("//li[@role='tab']//span//span");
	
	private By checkcancelorder=By.xpath("//label[@for='orderFilter']//span");
			
	private By checksPastOrders=By.xpath("//div[4]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//a[1]");

	// 2. Constructor of the page class:
	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean searchbuttoncheck() {
	
		return driver.findElement(searchbuttoncheck).isDisplayed();
	}

	public boolean usernamecheck() {
		// TODO Auto-generated method stub
		return driver.findElement(usernamecheck).isDisplayed();
	}

	public boolean logocheck() {
		// TODO Auto-generated method stub
		return driver.findElement(logocheck).isDisplayed();
	}

	public boolean cartcheck() {
		// TODO Auto-generated method stub
		return driver.findElement(cartcheck).isDisplayed();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public void clickonAccountsLists() {
		
		
		driver.findElement(clickonAccountsLists).click();
		
	}

	public void clickonYourOrders() {
		
		
		
		driver.findElement(clickonYourOrders).click();
		
	}

	public void clickonPastOrders() {
		
		
		driver.findElement(clickonPastOrders).click();
		
	}

	public boolean checksPastOrders() {
		return driver.findElement(checksPastOrders).isDisplayed();
//		return driver.findElement(secondpastorder).isDisplayed();
//		return driver.findElement(thirdpastorder).isDisplayed();
		
		
		
		
		
	}

	public void clickonCancelledOrders() throws InterruptedException {
		driver.findElement(clickonCancelledOrders).click();
		Thread.sleep(5000);
		
		
	}

	public boolean checksCancelledOrders() {
		
		return driver.findElement(checkcancelorder).isDisplayed();
				
				
	}

	
	}

