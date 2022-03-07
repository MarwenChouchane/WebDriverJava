package frame;

import base.BaseTests;
import org.junit.jupiter.api.Tag;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testIframe (){
        var framePage = homePage.clickframeLink();
        framePage.clearTextArea();
        framePage.setTextArea("Hello world");
        framePage.decreaseIndention();
        System.out.println(framePage.getTextFromEditor());
        assertEquals(framePage.getTextFromEditor(), "Hello world", "The text in the editor is incorrect");
    }
}
