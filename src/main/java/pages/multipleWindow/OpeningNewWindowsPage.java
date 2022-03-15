package pages.multipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpeningNewWindowsPage {

    private WebDriver driver ;
    private By openingButton = By.cssSelector(".example a");

    public OpeningNewWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openingNewWindow (){
        driver.findElement(openingButton).click();
    }
}
