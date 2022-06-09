package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	

@Given("User is on login page")
public void user_is_on_login_page() {
    
	System.out.println("---Inside Step: user_is_on_login_page---");
	
}

@When("user enter UN and PWD")
public void user_enter_un_and_pwd() {

	System.out.println("---Inside Step: user_enter_un_and_pwd---");
}

@And("clicks on login button")
public void clicks_on_login_button() {
   
	System.out.println("---Inside Step: clicks_on_login_button---");
}

@Then("user is navigated to Home Page")
public void user_is_navigated_to_home_page() {
   
	System.out.println("---Inside Step: user_is_navigated_to_home_page---");
}
	
	
}
