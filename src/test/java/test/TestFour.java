package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import page.TaskFour;

public class TestFour extends TestBase{
    @Test
    public void fourTest(){
        taskFour = PageFactory.initElements(driver, TaskFour.class);
        main.goTo();
        taskFour.goJobs();
        taskFour.fill("Java");
        taskFour.search();
        taskFour.APPLY();
        taskFour.check();


    }
}
