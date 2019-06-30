package stepsDefinations;

import java.util.List;

import com.Pages.loginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Loginpagetest {
	
	loginPage loginuser = new loginPage();
	

	@Given("^verify user open crm login page$")
	public void verify_user_open_crm_login_page() throws Throwable {
	   
		System.out.println("to implement pending ");
	    
	}

	
	@Given("^I enter username as password$")
	public void i_enter_username_as_password(DataTable userDetails) throws Throwable {
		
		List<List<String>> data=userDetails.raw();
		loginuser.userLogin(data.get(0).get(0),data.get(0).get(1));
	}

	@Given("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) throws Throwable {
	    
		System.out.println("click login");
	   
	}

	@Then("^verify Home Page$")
	public void verify_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
}
