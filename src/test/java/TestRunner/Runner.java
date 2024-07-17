package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		
		features= {"AllFeaturesFile/TC_OrangeHRM.feature"},
		glue= {"StepDefinationLayer"}
		
		
		)


public class Runner {

}
