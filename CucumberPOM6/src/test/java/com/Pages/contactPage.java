package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;



public class contactPage extends BasePage {
	
	
	public  contactPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@class='item']//span[text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactsTextname;
	
	@FindBy(xpath="//i[@class='edit icon']//parent::button[@class='ui linkedin button']")
	WebElement newContactbutton;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement Firstnametxt;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement Lastnametxt;
	
	public void clickContacts(){
		
		contactsLink.click();
		
	}
	
	public String verifyContacts(){
	
		String labelcontacts=contactsTextname.getText();
		return labelcontacts;
		
	}
	
	public void clicknewContactbutton(){
		
		newContactbutton.click();
	}
	
	public void enterFirstnameincontacts(String firstname){
		
		Firstnametxt.sendKeys(firstname);
	}
	
	public void enterLastnameincontacts(String lastname){
		
		Lastnametxt.sendKeys(lastname);
	}
	
	public void enterDepartnameincontacts(){
		
		newContactbutton.sendKeys("department");
	}
}
