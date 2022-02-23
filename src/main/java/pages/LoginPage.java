package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver ;
    private By userNameField = By.id("username"); //By.cssSelector("input#username")
    private By passwordField = By.id("password");  //By.cssSelector("input#password")
    private By loginButton = By.cssSelector("form#login > button");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName (String username){
        driver.findElement(userNameField).sendKeys(username);
    }

    public void setPassword (String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLogin (){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
