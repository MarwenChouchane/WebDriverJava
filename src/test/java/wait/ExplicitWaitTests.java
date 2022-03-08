package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExplicitWaitTests extends BaseTests {

    @Test
    public void waitingLoader (){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        var exemple1 = dynamicLoadingPage.clickExemple1();
        exemple1.clickButton();
        assertEquals(exemple1.getLoadedText(), "Hello World!", "The text isn't visible yet!");
    }

    @Test
    public void waitingLoader2 (){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        var exemple2 = dynamicLoadingPage.clickExemple2();
        exemple2.clickButton();
        assertFalse(exemple2.isStartButtonDisplayed(), "The button isn't displayed");
        assertEquals(exemple2.getLoadedText(), "Hello World!", "The text isn't visible yet!");
    }
}
