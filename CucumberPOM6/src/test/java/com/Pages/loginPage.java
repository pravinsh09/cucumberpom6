package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import BasePage.BasePage;

public class loginPage extends BasePage {
	

	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;
	
	public loginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	/*public homePage login() throws InterruptedException{
		
		return new homePage();
	}
	*/
	public void userLogin(String userName, String passWord) throws InterruptedException{
		
		Thread.sleep(2000);
		System.out.println("login");		
		username.sendKeys(userName);
		password.sendKeys(passWord);
		login.click();
	}

}
