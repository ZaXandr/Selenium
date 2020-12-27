package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class TaskFour extends BasePage {
    public TaskFour(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "CAREERS")
    WebElement Career;

    @FindBy(css = ".recruiting-search__input.js-autocomplete")
    WebElement searchField;

    @FindBy(css = ".recruiting-search__submit")
    WebElement startSearch;

    @FindBy(css = ".vacancy-page__id")
    WebElement vacancyPage;

    @FindBy(css = ".search-result__item-apply")
    WebElement Apply;



public void goJobs(){
    Career.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,450)", "");
}
    public void fill(String txt){
        searchField.click();
        searchField.sendKeys(txt);
    }
    public void search(){
       startSearch.click();
    }
    public void check(){
        assertTrue(vacancyPage.isDisplayed());
    }
    public void APPLY() {
        Apply.click();
    }
}
