package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Page {
	private WebDriver driver;
	
	@FindBy(css="._36HLxm.col.col-3-5>div>form>div>input")
	private WebElement flipkartuName;
	
	
	@FindBy (css="._36HLxm.col.col-3-5>div>form>div:nth-of-type(2)>input")
	private WebElement flipkartPwd;
	

	@FindBy(className = "_1D1L_j")
	private WebElement flipkartLoginBtn;
	
	
	public Flipkart_Page (WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean isLoginPageDisplayed () {
		flipkartPwd.isDisplayed();
		return flipkartuName.isDisplayed();
	}
	
	public void sendUname (String username) {
		flipkartuName.sendKeys(username);
	}
	
	public void sendPwd(String Pwd) {
		flipkartPwd.sendKeys(Pwd);
	}
	
	public void clickonLoginbtn() {
		flipkartLoginBtn.click();
	}
	
	
}
