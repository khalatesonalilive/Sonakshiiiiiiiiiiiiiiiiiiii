package StepDefinationLayer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPage {

	@Given("Scenario3 and   step1")
	public void scenario3_and_step1() {
	   System.out.println("scenario3_and_step1");
	}

	@When("Scenario3 and step2")
	public void scenario3_and_step2() {
	   System.out.println("scenario3_and_step2");
	}

	@Then("Scenario3 and step3")
	public void scenario3_and_step3() {
		 System.out.println("scenario3_and_step3");
	}

	@Given("Scenario4 and step1")
	public void scenario4_and_step1() {
		System.out.println("scenario4_and_step1");
	}

	@When("Scenario4 and step2")
	public void scenario4_and_step2() {
		System.out.println("scenario4_and_step2");
	}



}
