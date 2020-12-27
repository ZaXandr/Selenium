package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import page.TaskEight;

public class TestEight extends TestBase{
    @Test
    public void eightTest(){
        taskEight = PageFactory.initElements(driver, TaskEight.class);
        main.goTo();
        taskEight.clickButton();
        taskEight.scrollPage();
        taskEight.select();
        taskEight.check();
    }

}
