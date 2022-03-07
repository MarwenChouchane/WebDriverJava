package pages.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameExcercicePage {

    private WebDriver driver ;
    private String frameTop = "frame-top";
    private String frameLeft = "frame-left";
    private String frameButtom = "frame-bottom";
    private By textArea = By.tagName("body");

    public FrameExcercicePage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToframeLeft(){
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameLeft);
    }

    private void switchToframeButtom(){
        driver.switchTo().frame(frameButtom);
    }

    public String getFrameLeftText (){
        switchToframeLeft();
        String text = driver.findElement(textArea).getText();
        switchToTheMainArea();
        switchToTheMainArea();
        return text;
    }

    public String getFrameButtomText (){
        switchToframeButtom();
        String text = driver.findElement(textArea).getText();
        switchToTheMainArea();
        return text;
    }

    private void switchToTheMainArea (){
        driver.switchTo().parentFrame();
    }
}
