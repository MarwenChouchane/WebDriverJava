package pages.uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver ;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton (){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provide path of file to the form then click upload button
     * @param absolutePathOfFile the complete path of the file to upload
     */

    public UploadedFilePage uploadFile (String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
        return new UploadedFilePage(driver);
    }
}
