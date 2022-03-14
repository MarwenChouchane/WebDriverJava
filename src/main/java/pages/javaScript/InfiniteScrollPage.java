package pages.javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InfiniteScrollPage {

    private WebDriver driver ;
    private By textBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Scroll until paragprah with index specified is in view
     * @param index 1-Based
     */

    public void scrollToParagraph (int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver ;
        while (getNumberOfParagraphPresent() < index) {
            jsExecutor.executeScript(script);
        }
    }

    public int getNumberOfParagraphPresent (){
        return driver.findElements(textBlock).size();
    }
}
