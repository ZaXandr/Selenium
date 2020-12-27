package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import page.TaskSix;

public class TestSix extends TestBase{
    @Test
    public void testSix(){
        taskSix = PageFactory.initElements(driver, TaskSix.class);
        main.goTo();
        taskSix.ScrollDown();
    //   taskSix.SelectInst();
    }

}
