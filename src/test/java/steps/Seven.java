package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import page.TaskSeven;
import test.TestBase;

public class Seven extends TestBase {
    public Seven(){
        @Given("I am on the main page")
        public void i_am_on_the_main_page() {
            taskSeven = PageFactory.initElements(driver, TaskSeven.class);
            main.goTo();
            throw new io.cucumber.java.PendingException();
        }

        @Given("I click on the magnifier button")
        public void i_click_on_the_magnifier_button() {
            taskSeven.clickButton();
            throw new io.cucumber.java.PendingException();
        }

        @Given("Search menu drops down")
        public void search_menu_drops_down() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Given("I type in {string} in search field")
        public void i_type_in_in_search_field(String txt) {
            taskSeven.inputSearchTxt(txt);
            throw new io.cucumber.java.PendingException();
        }

        @When("I click Find button")
        public void i_click_button() {
            taskSeven.FindInf();
            throw new io.cucumber.java.PendingException();
        }

        @Then("I should see all results of search related to the ")
        public void i_should_see_all_results_of_search_related_to_the() {
            taskSeven.checkPageIsCorrect();
            throw new io.cucumber.java.PendingException();
        }

    }
}
