package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void uploadingFiles (){
        var fileUploadPage = homePage.clickFileUploadLink();
        var uploadedFilePage = fileUploadPage.uploadFile("E:\\Marwen\\Test auto\\Type of automated test.jpg");
        assertEquals(uploadedFilePage.getUploadedFileName(), "Type of automated test.jpg", "The file name is incorrect");
    }
}
