package keys;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EcerciceChapter6ArrowKeysTest  extends BaseTests {

    @Test
    public void testSlid (){
        String value = "2.5" ;
        var horizentalSliderPage = homePage.clickHorizentalSliderLink();
        horizentalSliderPage.setSliderValue(value);
        assertEquals(horizentalSliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}
