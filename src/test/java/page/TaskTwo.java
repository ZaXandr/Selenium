package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TaskTwo extends BasePage{


    public TaskTwo(WebDriver driver) {
        super(driver);
    }


    public void ScrollElement() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6500)", "");
    }

    public void selectCountry(){
        driver.findElement(By.xpath("//*[@alt='Canada']")).click();
    }
    public void Map(){
        driver.findElement(By.xpath("//*[@href='https://www.google.com/maps/place/343%20Preston%20St,%20Ottawa,%20ON%20K1S%201N4,%20Canada/@45.402295,-75.709408,16z/_data=!4m2!3m1!1s0x4cce04344c78d61b_0x1de77ff1bc5796f1?hl=en-US']"));
    }


}
