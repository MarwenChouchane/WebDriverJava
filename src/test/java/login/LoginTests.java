package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.login.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin (){
        LoginPage loginPage = homePage.clickFormAuthentificationLink();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLogin();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
