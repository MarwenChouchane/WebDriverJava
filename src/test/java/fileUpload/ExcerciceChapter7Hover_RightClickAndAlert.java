package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExcerciceChapter7Hover_RightClickAndAlert extends BaseTests {

    @Test
    public void contextAndAlert (){
        var contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.alert_Click();
        assertEquals(contextMenuPage.getAlertText_ByContextClick(), "You selected a context menu", "The alert text is incorrect");
        System.out.println(contextMenuPage.getAlertText_ByContextClick());
        contextMenuPage.alert_Accept();
        System.out.println(contextMenuPage.getH3());
        assertEquals(contextMenuPage.getH3(), "Context Menu", "The text is incorrect");
    }
}
