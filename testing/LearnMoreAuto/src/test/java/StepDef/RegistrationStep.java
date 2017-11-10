package StepDef;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStep {

	@When("^User fills in the registration$")
	public void User_fills_in_the_registration(DataTable testdata) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
	    
	     List<String> testDataAsList =  testdata.asList(String.class);
	     if(testdata.equals("Tester")){
	    	 System.out.println("I have a data called Tester");
	     }
	     System.out.println("Am here Registerme"+testDataAsList);
	}
	
	@And("^User enter \"(.*?)\" and \"(.*?)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("1st value is "+arg1+"  2nd val is "+arg2);
	}
	
	@Then("^User could understand internal array$")
	public void user_could_understand_internal_array(DataTable testMap) throws Throwable {
	     Map<String, String> map =  testMap.asMap(String.class, String.class);
	     System.out.println("Fisrt name is "+ map.get("FirstName")+" Last Name is "+map.get("LastName"));
		
	     Map<String, String> map_list =  testMap.asMap(String.class, String.class);
	     
	     System.out.println("Cool  "+map.toString());
	     List<Map<String,String>> maps= testMap.asMaps(String.class, String.class);
	     
	     System.out.println("Maps are "+maps.toString());
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	  
		
		
		
		
	}
	
}
