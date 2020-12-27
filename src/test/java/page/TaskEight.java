package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class TaskEight extends BasePage {
    @FindBy(linkText = "INSIGHTS")
    WebElement Insights;
    @FindBy(xpath ="//h5[text()='What’s Next for Digital Learning in 2021']" )
    WebElement Article;
    @FindBy(css = ".title-ui.title--center.title--mixed-case")
    WebElement Title;

    public TaskEight(WebDriver driver) {
        super(driver);
    }
    public void clickButton(){
       Insights.click();
    }
    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
    }
    public void select(){
        Article.click();
    }
    public void check(){
        assertTrue(Title.isDisplayed());
    }

}
