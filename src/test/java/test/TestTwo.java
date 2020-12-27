package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import page.TaskTwo;

public class TestTwo extends TestBase{
    @Test
    public void testTwo(){
        taskTwo = PageFactory.initElements(driver, TaskTwo.class);
        main.goTo();
        taskTwo.ScrollElement();
        taskTwo.selectCountry();
        taskTwo.Map();
    }
}
