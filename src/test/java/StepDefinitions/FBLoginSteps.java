package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBLoginSteps {

	


@Given("user is on login page")
public void user_is_on_login_page() {
    System.out.println("user is used URL for FB LoginPage");
}

@When("user enters username and password")
public void user_enters_username_and_password() {
    System.out.println("user entered valid username and password");
}

@And("clicks on login button")
public void clicks_on_login_button() {
    System.out.println("user is cklicks on login button");
}

@Then("user is navigated to the faceboook homepage")
public void user_is_navigated_to_the_faceboook_homepage() {
   System.out.println("user is login succefully in FaceBook login page");
   
}


}
