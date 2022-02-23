package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgottenPasswordPage {

    private WebDriver driver ;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgottenPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail (String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public ConfirmationPage clickretrievePassword (){
        driver.findElement(retrievePasswordButton).click();
        return new ConfirmationPage(driver);
    }

    public ConfirmationPage retrievePassword (String email){
        setEmail(email);
        return clickretrievePassword();
    }
}
