package pages.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    private WebDriver driver ;
    private String editorIFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentionButton = By.cssSelector("div:nth-of-type(5) > button:nth-of-type(2)");

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditorIframe (){
        driver.switchTo().frame(editorIFrameId);
    }

    public void clearTextArea (){
        switchToEditorIframe();
        driver.findElement(textArea).clear();
        switchToTheMainArea();
    }
    public void setTextArea (String text){
        switchToEditorIframe();
        driver.findElement(textArea).sendKeys(text);
        switchToTheMainArea();
    }

    public void decreaseIndention (){ //element dans main area not in the iframe
        driver.findElement(decreaseIndentionButton).click();
    }

    public String getTextFromEditor (){
        switchToEditorIframe();
        String text = driver.findElement(textArea).getText();
        switchToTheMainArea();
        return text;
    }

    private void switchToTheMainArea (){
        driver.switchTo().parentFrame();
    }
}
