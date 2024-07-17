package StepDefinationLayer;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class HOOKS {

	@BeforeAll()
	public static void a1()
	{
		
		System.out.println("BeforeAll");
	}
	
	@AfterAll()
	public static void a2()
	{
		System.out.println("AfterAll");
	}
	
	
	@Before()
	public static void a3()
	{
		System.out.println("Before");
	}
	
	@After()
	public static void a4()
	{
		System.out.println("After");
	}
	
	@BeforeStep
	public static void a5()
	{
		System.out.println("BeforeStep");
	}
	
	@AfterStep
	public static void a6()
	{
		System.out.println("AfterStep");
	}
	
	
}
