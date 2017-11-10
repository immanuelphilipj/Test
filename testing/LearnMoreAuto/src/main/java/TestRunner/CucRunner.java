package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"Features\\test.feature", "Features\\Registration.feature"},
		glue ={"stepDef"}
		)
public class CucRunner {

}
