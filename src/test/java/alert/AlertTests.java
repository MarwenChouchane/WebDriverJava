package alert;

import base.BaseTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert (){
        var alertPage = homePage.clickJavaScriptAlertLink();
        alertPage.clickJsAlert();
        assertEquals(alertPage.getAlertText(), "I am a JS Alert", "The alert text is incorrect");
        System.out.println(alertPage.getAlertText());
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(), "You successfully clicked an alert", "The text result is incorrect");
    }

    @Test
    public void testDismissConfirmAlert (){
        var alertPage = homePage.clickJavaScriptAlertLink();
        alertPage.clickJsConfirmButton();
        assertEquals(alertPage.getAlertText(), "I am a JS Confirm", "The alert text is incorrect");
        System.out.println(alertPage.getAlertText());
        alertPage.alert_ClickToDismiss();
        assertEquals(alertPage.getResult(), "You clicked: Cancel", "The text result is incorrect");
        System.out.println(alertPage.getResult());
    }

    @Test
    public void testAcceptConfirmAlert (){
        var alertPage = homePage.clickJavaScriptAlertLink();
        alertPage.clickJsConfirmButton();
        assertEquals(alertPage.getAlertText(), "I am a JS Confirm", "The alert text is incorrect");
        System.out.println(alertPage.getAlertText());
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(), "You clicked: Ok", "The text result is incorrect");
        System.out.println(alertPage.getResult());
    }

    @Test
    @Tag("Prompt Test")
    public void testDismissPromptAlert (){
        var alertPage = homePage.clickJavaScriptAlertLink();
        alertPage.clickJsPromptButton();
        assertEquals(alertPage.getAlertText(), "I am a JS prompt", "The alert text is incorrect");
        System.out.println(alertPage.getAlertText());
        alertPage.alert_ClickToDismiss();
        assertEquals(alertPage.getResult(), "You entered: null", "The text result is incorrect");
        System.out.println(alertPage.getResult());
    }

    @Test
    @Tag("Prompt Test")
    public void testAcceptPromptAlert (){
        String text = "Premier text prompt alert";
        var alertPage = homePage.clickJavaScriptAlertLink();
        alertPage.clickJsPromptButton();
        assertEquals(alertPage.getAlertText(), "I am a JS prompt", "The alert text is incorrect");
        System.out.println(alertPage.getAlertText());
        alertPage.setPromptAlertText(text);
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(), "You entered: "+text, "The text result is incorrect");
        System.out.println(alertPage.getResult());
    }
}
