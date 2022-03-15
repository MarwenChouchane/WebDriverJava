package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator () {
        homePage.clickDynamicLoadingLink().clickExemple1();
        getWindowManger().goBack();
        getWindowManger().refreshPage();
        getWindowManger().goForward();
        getWindowManger().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab (){
        homePage.clickMultipleWindowsLink().openingNewWindow();
        getWindowManger().switchToTab("New Window");
    }
}
