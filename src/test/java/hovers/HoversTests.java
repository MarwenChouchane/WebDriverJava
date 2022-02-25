package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class HoversTests extends BaseTests {

    @Test
    public void testHoversUser1 (){
        var hoversPage   = homePage.clickHoversLink();
        var caption = hoversPage.hoverImage(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Caption link incorrect");
    }
}
