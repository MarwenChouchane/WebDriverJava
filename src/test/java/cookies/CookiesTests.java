package cookies;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CookiesTests extends BaseTests {
    @Test
    public void testDeleteCookie(){
        var cookiesManager = getCookieManager();
        Cookie cookie = cookiesManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookiesManager.deleteCookie(cookie);
        assertFalse(cookiesManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}
