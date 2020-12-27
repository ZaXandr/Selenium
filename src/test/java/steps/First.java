package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import page.TaskOne;
import test.TestBase;

public class First extends TestBase {
    public First() {
        @Given("I am on min page")
        public void i_am_on_min_page() {
            taskOne = PageFactory.initElements(driver, TaskOne.class);
            main.goTo();
            throw new io.cucumber.java.PendingException();
        }

        @When("I click to language button")
        public void i_click_to_language_button() {
            taskOne.clickLanguage();
            throw new io.cucumber.java.PendingException();
        }

        @When("Chose Ukrainian")
        public void chose_ukrainian() {
            taskOne.selectLan();
            throw new io.cucumber.java.PendingException();
        }

        @Then("i go on Ukr Webpage")
        public void i_go_on_ukr_webpage() {
            taskOne.check();
            throw new io.cucumber.java.PendingException();
        }
    }

}
