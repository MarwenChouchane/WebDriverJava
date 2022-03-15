package pages.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class DynamicLoadingExemple2Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("div#start > button");
    private By loadingindicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExemple2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton() {
//      explicit wait
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText)); //wait until the text appear in the dom
    }

    public boolean isStartButtonDisplayed() {
        return driver.findElement(startButton).isDisplayed();
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }
}
