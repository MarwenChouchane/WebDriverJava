package pages.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {

    private WebDriver driver ;

    public NestedFramePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public FrameExcercicePage clickNestedFrameLink (){
        clickLink("Nested Frames");
        return new FrameExcercicePage(driver);
    }
}
