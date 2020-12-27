package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskSix extends BasePage{

    public TaskSix(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "=//a[@class='footer__social-link'][3]=")
    WebElement Canada;

    public void ScrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6500)", "");
    }
    public void SelectInst(){

       Canada.click();
    }
}
