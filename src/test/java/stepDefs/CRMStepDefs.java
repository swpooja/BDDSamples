package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDefs {
	//@BeforeAll
	//@Before
	//@BeforeStep
//	public static void initDB() {
//		System.out.println("Init DB....");
//	}
//	
//	@AfterAll
//	@After
//	@AfterStep
//	public static void closeDB() {
//		System.out.println("Close DB....");
//	}
	
	@Before("@SmokeTest")
	public static void initChrome() {
		System.out.println("Init chrome....");
	}
	
	@Before("@RegressionTest")
	public static void initEdge() {
		System.out.println("Init Edge....");
	}
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("User is logged in");
	}

	@When("User view Deals details")
	public void user_view_deals_details() {
		System.out.println("User view Deals details");
	}
	@When("User delete a Deals")
	public void user_delete_a_deals() {
		System.out.println("User delete a Deals");
	}
	@When("User create a new Deals")
	public void user_create_a_new_deals() {
		System.out.println("User create a new Deals");
	}
	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact");
	}
	@When("User view contact details")
	public void user_view_contact_details() {
		System.out.println("User view contact details");
	}
	
	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("user_create_a_new_contact");
	}
	@When("User delete a Tasks")
	public void user_delete_a_tasks() {
		System.out.println("User delete a Tasks");
	}
	@When("User view Task details")
	public void user_view_task_details() {
		System.out.println("User view Task details");
	}
	@When("User create a new Tasks")
	public void user_create_a_new_tasks() {
		System.out.println("User create a new Tasks");
	}

}
