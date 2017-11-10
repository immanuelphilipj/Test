package StepDef;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.java.en.Then;

public class LoginStepDef {

	@Given("^User (?:is on|navigates to) (.*com)$")
	public void NavigateTo(String url) throws Throwable {
	    System.out.println("Inside Given  "+url);
	}

	@But("^User do not logs in using valid (.*)$")
	public void User_do_not_logs_in_using_valid_password(String a) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}	
	@When("^User clicks on MyAccount links$")
	public void User_clicks_on_MyAccount_links() throws Throwable {

		System.out.println("Inside WHEN");
	}

	@And("^User logs in using valid username (.*) and password (.*)$")
	public void LoginCredidential(String username, String password) throws Throwable {

		System.out.println("Inside AND "+username+" username n password "+password);
	}
	
	//Regular expression using keyword Alteration. Combination separated by pipe operator
	@Then("^User is able to login successfully$")
	public void User_is_able_to_login_successfully() throws Throwable {
	
		System.out.println("Inside then");
	}
}
