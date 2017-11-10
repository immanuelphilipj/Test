package stepDef;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Registration {

	
	@Given("^User navigates to http://Google\\.com$")
	public void user_navigates_to_http_Google_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Registration Given ");
		
	}

	@When("^User fills in the registration$")
	public void user_fills_in_the_registration(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    System.out.println("Registration WHEN");
	}

	@Then("^User could understand internal array$")
	public void user_could_understand_internal_array(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    System.out.println("Registration THEN");
	}

	@But("^User should have \"([^\"]*)\" in right \"([^\"]*)\"$")
	public void user_should_have_in_right(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("First user is "+arg1+" His password is "+ arg2);
	}
	
}
