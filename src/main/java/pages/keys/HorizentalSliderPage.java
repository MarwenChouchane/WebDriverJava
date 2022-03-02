package pages.keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizentalSliderPage {

    private WebDriver driver ;
    private By slider = By.cssSelector("div#content > div > div > input");
    private By sliderValue = By.id("range");

    public HorizentalSliderPage (WebDriver driver) {
        this.driver = driver;
    }

    public String getSliderValue (){
        return driver.findElement(sliderValue).getText();
    }

    public void setSliderValue (String value){
        while(!getSliderValue().equals(value)){  // ! = getSliderValue <> value
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

}
