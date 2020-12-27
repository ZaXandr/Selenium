package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import page.TaskFive;
import test.TestBase;

public class Five extends TestBase {
    public Five(){
        @Given("I am on the main page")
        public void i_am_on_the_main_page() {
            taskFive = PageFactory.initElements(driver, TaskFive.class);
            main.goTo();
            throw new io.cucumber.java.PendingException();
        }

        @Given("I click Find your dream job button")
        public void i_click_Find_your_dream_job_button() {
                TaskFive.clickButton();
            throw new io.cucumber.java.PendingException();
        }

        @When("I select Location {Kiev}")
        public void i_select_location_kiev(String location) {
            taskFive.inputCity(location);
            throw new io.cucumber.java.PendingException();
        }

        @Then("I should see all job offers in Kiev")
        public void i_should_see_all_job_offers_in_kiev() {
            taskFive.find();
            taskFive.check();
            throw new io.cucumber.java.PendingException();
        }

    }
}
