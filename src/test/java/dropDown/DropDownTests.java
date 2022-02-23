package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropDownTests extends BaseTests {

    @Test
    public void selectOption(){
        var dropDownPage = homePage.clickDropDownLink();
        //dropDownPage.findDropDown();
        String options = "Option 1";
        dropDownPage.selectFromDropDownList(options);
        var selectedOptions = dropDownPage.getSelectedoptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selection!");
        assertTrue(selectedOptions.contains(options), "Option isn't selected!");
    }
}
