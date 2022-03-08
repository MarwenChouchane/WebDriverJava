package pages.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver ;
    private By exemple1Link = By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By exemple2Link = By.xpath("//*[@id=\"content\"]/div/a[2]");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExemple1Page clickExemple1 (){
        driver.findElement(exemple1Link).click();
        return new DynamicLoadingExemple1Page(driver);
    }

    public DynamicLoadingExemple2Page clickExemple2 (){
        driver.findElement(exemple2Link).click();
        return new DynamicLoadingExemple2Page(driver);
    }
}
