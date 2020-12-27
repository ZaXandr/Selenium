package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskFive extends BasePage{

    public TaskFive(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//*[@id=\"main\"]/div[1]/div[6]/section/div/div[3]/div/a" )
    WebElement DreamJobButton;

    @FindBy(css = ".select2-selection__rendered")
    WebElement locationFieldRendered;

    @FindBy(css = ".select2-search__field")
    WebElement locationField;

    @FindBy(css = ".recruiting-search__submit")
    WebElement button;

    @FindBy(css = ".search-result__heading")
    WebElement findButton;

    public void clickButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", DreamJobButton);
    }
    public void inputCity(String city) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");

        locationFieldRendered.click();
         locationField.sendKeys(city);
    }
    public void find(){
        button.click();
    }
    public void check() {
    findButton.click();
    }









}
