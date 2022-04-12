package stepDefinitions;


//All the below code is copied using [Tidy Gherkin] Chrome App. 

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on the the NetBanking Landing Page$")
    public void user_is_on_the_the_netbanking_landing_page() throws Throwable {
        System.out.println("Code Executed Successfully -- User on the Landing Page");
        
    }

    @When("^User enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
    	System.out.println("Code Executed Successfully --  User Entered UserName and Password");
    		
    }
    

    @Then("^User land on to home page$")
    public void user_land_on_to_home_page() throws Throwable {
    	System.out.println("Code Executed Successfully -- User Landed on Home Page");
    	
    }

    @And("^Users Cerdit/Debit Cards are displayed$")
    public void users_cerditdebit_cards_are_displayed() throws Throwable {
    	System.out.println("Code Executed Successfully --  Cerdit/Debit Cards are displayed");
    }
    
    

}
