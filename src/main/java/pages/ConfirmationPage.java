package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

    private WebDriver driver ;
    private By message = By.cssSelector("html > body > h1");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessageText (){
        return driver.findElement(message).getText();
    }
}
