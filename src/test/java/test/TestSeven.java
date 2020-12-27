package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import page.TaskSeven;

public class TestSeven extends TestBase{
    @Test
    public void sevenTest(){
        taskSeven = PageFactory.initElements(driver, TaskSeven.class);
        main.goTo();
        taskSeven.clickButton();
        taskSeven.inputSearchTxt("Java");
        taskSeven.FindInf();
        taskSeven.checkPageIsCorrect();
    }
}
