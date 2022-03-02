package pages.uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver ;
    private By alert_Trigger = By.id("hot-spot");
    private By h3Text = By.tagName("h3");

    public ContextMenuPage (WebDriver driver){
        this.driver = driver;
    }

    public void alert_Click (){
        WebElement box_Trigger = driver.findElement(alert_Trigger);
        Actions actions = new Actions(driver);
        actions.moveToElement(box_Trigger).contextClick().perform();
    }

    public String getAlertText_ByContextClick (){
        return driver.switchTo().alert().getText();
    }

    public void alert_Accept (){
        driver.switchTo().alert().accept();
    }

    public String getH3 (){
        return driver.findElement(h3Text).getText();
    }
}
