package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.*;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Main main;
    public TaskSeven taskSeven;
    public TaskEight taskEight;
    public TaskTwo taskTwo;
    public TaskFive taskFive;
    public TaskFour taskFour;
    public TaskSix taskSix;
    public TaskOne taskOne;
    public TaskThree taskThree;


    @BeforeEach
    public void start(){
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         main= PageFactory.initElements(driver,Main.class);










     }
//@AfterEach
    public void finish(){
         driver.quit();
     }
}
