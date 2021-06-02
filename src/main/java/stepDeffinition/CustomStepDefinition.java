package stepDeffinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.parser.node.SetPropertyExecutor;


public class StepDefinition {
    @Given("^Open the Firefox and launch the application$")
    public void open_the_firefox_and_launch_the_application() throws Throwable{
        SetPropertyExecutor dr = new SetPropertyExecutor()
        // Write code here that turns the phrase above into concrete actions

        throw new io.cucumber.java.PendingException();
    }

    @When("^Enter the Username and Password$")
    public void enter_the_username_and_password() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Reset the credential")
    public void reset_the_credential() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
