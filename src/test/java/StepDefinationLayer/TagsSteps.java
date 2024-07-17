package StepDefinationLayer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsSteps {
	@Given("Regression Scenario step1")
	public void regression_scenario_step1() {
	    
		System.out.println("Regression Scenario step1");
	}

	@When("Regression Scenario step2")
	public void regression_scenario_step2() {
	    
		System.out.println("Regression Scenario step2");
	}

	@Then("Regression Scenario step3")
	public void regression_scenario_step3() {
	    
		System.out.println("Regression Scenario step3");
	}

}
