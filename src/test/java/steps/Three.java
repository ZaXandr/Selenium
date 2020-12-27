package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import page.TaskThree;
import test.TestBase;


public class Three extends TestBase{
    public Three() {
        @Given("I am on main page")
        public void i_am_on_main_page() {
            taskThree = PageFactory.initElements(driver, TaskThree.class);
            main.goTo();
            throw new io.cucumber.java.PendingException();
        }

        @When("I dicrease size of window")
        public void i_dicrease_size_of_window() {
            taskThree.SetWindow();
            throw new io.cucumber.java.PendingException();
        }

        @Then("All menu options should be compressed in one button with the drop submenu")
        public void all_menu_options_should_be_compressed_in_one_button_with_the_drop_submenu (){
            taskThree.FindMenu();
            throw new io.cucumber.java.PendingException();
        }
    }
}
