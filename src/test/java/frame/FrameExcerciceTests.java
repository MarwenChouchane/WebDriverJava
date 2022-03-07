package frame;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameExcerciceTests extends BaseTests {

    @Test
    public void testIframe (){
        var nestedFramePage = homePage.clickFrameExcerciceLink();
        var frameExcercicePage = nestedFramePage.clickNestedFrameLink();
        System.out.println(frameExcercicePage.getFrameLeftText());
        assertEquals(frameExcercicePage.getFrameLeftText(), "LEFT", "The frame name is incorrect");
        System.out.println(frameExcercicePage.getFrameButtomText());
        assertEquals(frameExcercicePage.getFrameButtomText(), "BOTTOM", "The frame name is incorrect");
    }
}
