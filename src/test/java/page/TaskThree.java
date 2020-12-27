package page;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class TaskThree extends BasePage{
    public TaskThree(WebDriver driver) {
        super(driver);
    }

    @FindBy(css =".hamburger-menu__button" )
    WebElement hamburgerMenu;
    public void SetWindow(){
        driver.manage().window().setSize(new Dimension(1000, 700));
    }
    public void FindMenu(){
       assertTrue(hamburgerMenu.isDisplayed());
    }
}
