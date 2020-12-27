package page;

import org.openqa.selenium.WebDriver;

public class Main extends BasePage{
    String SITE_URL="https://www.epam.com/";
    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo(){
        driver.get(SITE_URL);
        return this;
    }

}
