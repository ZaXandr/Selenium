package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskOne extends BasePage{


    public TaskOne(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".location-selector__button")
    WebElement languageButton;

    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/nav/ul/li[8]/a")
    WebElement Ukraine_en;


    public void clickLanguage(){
       languageButton.click();
    }

    public void selectLan(){

        Ukraine_en.click();
    }

    public void check(){
       assertTrue(languageButton.isDisplayed());
    }



}
