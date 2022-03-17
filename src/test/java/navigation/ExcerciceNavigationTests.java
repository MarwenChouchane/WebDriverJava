package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ExcerciceNavigationTests extends BaseTests {

    @Test
    public void testOpenPageInNewTab () {
        var dynamicLoadPage = homePage.clickDynamicLoadingLink();
        var example2Page = dynamicLoadPage.openingExemple2WithRightClick();
        getWindowManger().switchToTaburl("https://the-internet.herokuapp.com/dynamic_loading/2");
        assertTrue(example2Page.isStartButtonDisplayed(), "This isn't the correct window");
    }
}
