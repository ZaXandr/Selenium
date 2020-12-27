package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskSeven extends BasePage{

    public TaskSeven(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".header-search__button.header__icon")
    WebElement searchButton;

    @FindBy(css =".header-search__input.frequent-searches__input" )
    WebElement searchField;

    @FindBy(css=".header-search__submit")
    WebElement startSearch;

    @FindBy(css = ".search-results__auto-correct-term")
    WebElement result;

    public void clickButton(){
        searchButton.click();
    }
    public void inputSearchTxt(String txt) {
        searchField.sendKeys(txt);
    }
    public void FindInf(){
       startSearch.click();
    }


    public void checkPageIsCorrect(){
        Assert.assertTrue(result.isDisplayed());
    }
}
