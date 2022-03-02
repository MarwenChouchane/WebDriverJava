package pages.uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadedFilePage {

    private WebDriver driver ;
    private By uploadedFileName = By.id("uploaded-files");

    public UploadedFilePage (WebDriver driver) {
        this.driver = driver;
    }

    public String getUploadedFileName (){
        return driver.findElement(uploadedFileName).getText();
    }
}
