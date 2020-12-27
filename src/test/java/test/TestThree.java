package test;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import page.TaskThree;

public class TestThree extends TestBase{

    @Test
    public void testThree(){
        taskThree = PageFactory.initElements(driver, TaskThree.class);
        main.goTo();
        taskThree.SetWindow();
        taskThree.FindMenu();
    }
}
