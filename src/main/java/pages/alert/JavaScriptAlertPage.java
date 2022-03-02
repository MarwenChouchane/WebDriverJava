package pages.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {

    private WebDriver driver ;
    private By triggerJsAlertButton = By.cssSelector("div#content > div > ul > li:first-child > button ");
    private By resultText = By.id("result");
    private By jsConfirmButton = By.cssSelector("div#content > div > ul > li:nth-of-type(2) > button");
    private By jsPromptButton = By.cssSelector("div#content > div > ul > li:nth-of-type(3) > button");

    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResult (){
        return driver.findElement(resultText).getText();
    }

    //Alert
    public void clickJsAlert (){
        driver.findElement(triggerJsAlertButton).click();
    }
    public void alert_ClickToAccept (){
        driver.switchTo().alert().accept();
    }
    public String getAlertText (){
        return driver.switchTo().alert().getText();
    }

    //Confirm Alert
    public void clickJsConfirmButton (){
        driver.findElement(jsConfirmButton).click();
    }
    public void alert_ClickToDismiss (){
        driver.switchTo().alert().dismiss();
    }

    //Prompt alert
    public void clickJsPromptButton (){
        driver.findElement(jsPromptButton).click();
    }

    public void setPromptAlertText (String text){
         driver.switchTo().alert().sendKeys(text);
    }
}
