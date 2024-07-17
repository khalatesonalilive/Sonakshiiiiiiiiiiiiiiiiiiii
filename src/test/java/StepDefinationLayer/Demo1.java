package StepDefinationLayer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1 {

	@Given("Background Keyword step1")
	public void background_keyword_step1() {
		System.out.println("background keyword and step1");
	}

	@Given("Background Keyword step2")
	public void background_keyword_step2() {
		System.out.println("background keyword and step2");
	}

	@Given("Scenario1 step1")
	public void scenario1_step1() {
		System.out.println("scenario1_step1");
	}

	@When("Scenario1  step2")
	public void scenario1_step2() {
		System.out.println("scenario1_step2");
	}

	@Then("Scenario1 step {int}")
	public void scenario1_step(Integer int1) {
		System.out.println("scenario1_step3");
	}

	@Given("Scenario2 step1")
	public void scenario2_step1() {
		System.out.println("scenario2_step1");
	}

	@When("Scenario2  step2")
	public void scenario2_step2() {
		System.out.println("scenario2_step2");
	}



}
