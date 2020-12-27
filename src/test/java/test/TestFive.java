package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import page.TaskFive;

public class TestFive extends TestBase{
    @Test
    public void testFive(){
        taskFive = PageFactory.initElements(driver, TaskFive.class);
        main.goTo();
        taskFive.clickButton();
        taskFive.inputCity("Kyiv");
        taskFive.find();
        taskFive.check();
    }

}
