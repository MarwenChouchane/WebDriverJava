package pages.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class DynamicLoadingExemple1Page {

    private WebDriver driver ;
    private By startButton = By.cssSelector("div#start > button");
    private By loadingindicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExemple1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton (){
//      explicit wait
        driver.findElement(startButton).click();
//      WebDriverWait wait = new WebDriverWait(driver, 5);
//      wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingindicator))); //wait until the loader disappear
//      Fluent wait
        FluentWait wait = new FluentWait(driver)
        .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingindicator)));
    }

    public String getLoadedText (){
        return driver.findElement(loadedText).getText();
    }
}
