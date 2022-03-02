package pages.hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver ;
    private By imagesBox = By.className("figure");
    private By boxCapture = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param index  start at 1
     */

    public ImageCaption hoverImage (int index){
        WebElement images = driver.findElements(imagesBox).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(images).perform();
        return new ImageCaption(images.findElement(boxCapture));
    }



    public class ImageCaption  {
        private WebElement caption ;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public ImageCaption (WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed (){
            return caption.isDisplayed();
        }

        public String getTitle (){
            return caption.findElement(header).getText();
        }

        public String getLink (){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText (){
            return caption.findElement(link).getText();
        }
    }
}
