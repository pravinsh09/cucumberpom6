package stepsDefinations;

import java.util.List;

import com.Pages.contactPage;
import com.Pages.loginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class Contactpagetest {
	
	loginPage loginuser = new loginPage();
	contactPage contpage = new contactPage();
	
	/*	@Given("^I enter username as password$")
	public void i_enter_username_as_password(DataTable userDetails1) throws Throwable {
		
		List<List<String>> data=userDetails1.raw();
		loginuser.userLogin(data.get(0).get(0),data.get(0).get(1));
	}*/


	@And("^click on the contacts link$")
	public void click_on_the_contacts_link() throws Throwable {
		contpage.clickContacts();
			
	}

	
	@Then("^verify user is on contact page$")
	public void verify_user_is_on_contact_page() throws Throwable {
	   
		System.out.println("inside3");
		String actual=contpage.verifyContacts();
		Assert.assertEquals("Contacts",actual);
		
	}
	
	@Given("^click on new button$")
	public void click_on_new_button() throws Throwable {
	   
		contpage.clicknewContactbutton();
		Thread.sleep(4000);
	}
	
	
	@Given("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String fname, String lname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contpage.enterFirstnameincontacts(fname);
		contpage.enterLastnameincontacts(lname);
	}
	
	
	
	
	@Then("^Enter the department$")
	public void enter_the_department() throws Throwable {
    
		System.out.println("Deparment");
	}

}
