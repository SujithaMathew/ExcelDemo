package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


public class stepDefinition {

    @Given("^User is a Netbanking login page$")
    public void user_is_a_netbanking_login_page() throws Throwable {
       System.out.println("Navigated to login page");
    }

    @When("^User login into application with usename and password$")
    public void user_login_into_application_with_usename_and_password() throws Throwable {
    	System.out.println("Login");
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	System.out.println("Homepage open");
    }
    @When("User login into application with {string} and {string}")
    public void user_login_into_application_with_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
        System.out.println(string2);
        
    }
    @Then("Cards displayed are {string}")
    public void cards_displayed_are(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Cards displayed");
    }

}