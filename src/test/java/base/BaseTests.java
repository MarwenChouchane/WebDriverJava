package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();  // or maximize() or fullscreen() or setSize(new Dimension(375,812)) = mobile

        /*WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        inputLink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The total number of links in the page is " +links.size());*/

        WebElement inputLinkNotFound = driver.findElement(By.linkText("Angie"));
        inputLinkNotFound.click();

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main (String args[]){
        BaseTests Test = new BaseTests();
        Test.setUp();
    }
}
