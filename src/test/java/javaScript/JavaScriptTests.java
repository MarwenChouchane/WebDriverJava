package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable (){
        //var javaScriptPage = homePage.clickLargeAndDeepDomLink();
        //javaScriptPage.scrollToTable();
        homePage.clickLargeAndDeepDomLink().scrollToTable();
    }

    @Test
    public void testScrollUntilElementPresent (){
        homePage.clickInfiniteScrollLink().scrollToParagraph(3);
    }

    @Test
    public void testSelectFromDropDownList(){
        var dropDownPage = homePage.clickDropDownLink();
        dropDownPage.addMultipleAttribut();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDownList);

        var selectedOptions = dropDownPage.getSelectedoptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
