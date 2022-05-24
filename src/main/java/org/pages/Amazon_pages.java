package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_pages {
	WebDriver driver;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchField ;
	
	@FindBy (id = "nav-search-submit-button")
	private WebElement searchButn;
	
	
	public Amazon_pages (WebDriver driver) {
	
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	


	public boolean isSearchBoxDisplayed() {
		return searchField.isDisplayed();
	}
	
	public void searchfor_Iphone13 () {
		searchField.sendKeys("Iphone 13");
	}
	
	
	public boolean isSearchBtnDisplayed() {
		return searchButn.isDisplayed();
	}
	
	public void clickOnbuton() {
		searchButn.click();
	}
	
}
