package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import page.TaskFour;
import test.TestBase;

public class Four extends TestBase{
    public Four() {

        @Given("I am on main page")
        public void i_am_on_the_page_with_the_list_of_java_vacancies () {
            taskFour = PageFactory.initElements(driver, TaskFour.class);
            main.goTo();
            throw new io.cucumber.java.PendingException();
        }
        @Given("I am on the page with the list of vacancies")
        public void i_am_on_the_page_with_the_list_of_java_vacancies () {
            taskFour.goJobs();
            throw new io.cucumber.java.PendingException();
        }
        @When("I input {job} ")
        public void i_click_button (String job){
            taskFour.fill(job);
            throw new io.cucumber.java.PendingException();
        }

        @When("I click  button")
        public void i_click_button (){
            taskFour.search();
            taskFour.APPLY();
            throw new io.cucumber.java.PendingException();
        }

        @Then("I should see an information about the job")
        public void i_should_see_an_information_about_the_job () {

            taskFour.check();
            throw new io.cucumber.java.PendingException();
        }
    }
}
