package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.alert.JavaScriptAlertPage;
import pages.dropDown.DropDownPage;
import pages.dropDown.ForgottenPasswordPage;
import pages.hover.HoversPage;
import pages.keys.HorizentalSliderPage;
import pages.keys.KeyPressPage;
import pages.login.LoginPage;
import pages.uploadFile.ContextMenuPage;
import pages.uploadFile.FileUploadPage;

public class HomePage {
    private WebDriver driver ;
    //private By formAuthentificationLink = By.linkText("Form Authentication"); // By.cssSelector("div#content > ul > li:nth-of-type(21) >a")  //
    //private By dropDownLink = By.linkText("Dropdown");; // By.cssSelector("div#content > ul > li:nth-of-type(11) > a")

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentificationLink () {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

/*
    public LoginPage clickFormAuthentificationLink (){
        driver.findElement(formAuthentificationLink).click();
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDownLink (){
        driver.findElement(dropDownLink).click();
        return new DropDownPage(driver);
    }
*/
    public DropDownPage clickDropDownLink (){
    clickLink("Dropdown");
    return new DropDownPage(driver);
}

    public ForgottenPasswordPage clickForgotPasswordLink (){
        clickLink("Forgot Password");
        return new ForgottenPasswordPage(driver);
    }

    public HoversPage clickHoversLink (){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressPage clickKeyPressLink (){
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public HorizentalSliderPage clickHorizentalSliderLink (){
        clickLink("Horizontal Slider");
        return new HorizentalSliderPage(driver);
    }

    public JavaScriptAlertPage clickJavaScriptAlertLink (){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertPage(driver);
    }

    public FileUploadPage clickFileUploadLink (){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenuLink (){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
}
