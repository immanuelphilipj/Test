package stepDef;

import cucumber.api.java.en.*;

public class Login {

	@Given("^User is logged into application$")
	public void user_is_logged_into_application() throws Throwable {
	 System.out.println("Login GIVEN");  
	}

	@And("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {

		
		System.out.println("Login 1st arg "+arg1+" Second "+arg2);
		
	}

	@Then("^User is logged in successfully\\.$")
	public void user_is_logged_in_successfully() throws Throwable {

		System.out.println("LOGIN THEN");
	}

	
}
