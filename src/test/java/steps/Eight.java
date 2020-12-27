package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.PageFactory;
import page.TaskEight;
import test.TestBase;

public class Eight extends TestBase {
    public void Eight(){
        @Given("I am on main page")
        public void i_am_on_insights_page() {
            taskEight = PageFactory.initElements(driver, TaskEight.class);
            main.goTo();
            throw new io.cucumber.java.PendingException();
        }

        @Given("I go  to Insights")
        public void i_scroll_to_the_filter_by() {
            taskEight.clickButton();
            throw new io.cucumber.java.PendingException();
        }

        @When("I select What’s Next for Digital Learning in 2021")
        public void i_select_travel_hospitality() {
            taskEight.select();
            throw new io.cucumber.java.PendingException();
        }

        @Then("I must to see all the insiders in the selected category")
        public void i_must_to_see_all_the_insiders_in_the_selected_category() {
            taskEight.check();
            throw new io.cucumber.java.PendingException();
        }
    }
}
