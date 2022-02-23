package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.ForgottenPasswordPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ExerciceChapter4ForgottenPassword extends BaseTests {

    @Test
    public void testSuccessfullLogin (){
       /* ForgottenPasswordPage forgottenPasswordPage = homePage.clickForgotPasswordLink();
        forgottenPasswordPage.setEmail("tau@example.com");
        ConfirmationPage confirmationPage = forgottenPasswordPage.clickretrievePassword();
        assertTrue(confirmationPage.getMessageText().contains("Your e-mail's been sent!"),
                "Message text is incorrect");
      */
        var forgottenPasswordPage = homePage.clickForgotPasswordLink();
        var confirmationPage = forgottenPasswordPage.retrievePassword("tau@example.com");
        assertEquals(confirmationPage.getMessageText(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
