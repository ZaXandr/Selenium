package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import page.TaskOne;

public class TestOne extends TestBase {
    @Test
        public void FirstTest(){
        taskOne = PageFactory.initElements(driver, TaskOne.class);
        main.goTo();
        taskOne.clickLanguage();
        taskOne.selectLan();
        taskOne.check();
        }
}
