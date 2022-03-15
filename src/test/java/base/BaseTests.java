package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.home.HomePage;
import utiles.WindowManager;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage ;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
/*
        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        inputLink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The total number of links in the page is " +links.size());

        WebElement inputLinkNotFound = driver.findElement(By.linkText("Angie"));
        inputLinkNotFound.click();

        System.out.println(driver.getTitle());
*/
    }

    @BeforeMethod
    public void goHome (){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();  // or maximize() or fullscreen() or setSize(new Dimension(375,812)) = mobile
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManger (){
        return new WindowManager(driver);
    }
/*
    public void clickAuthetification (){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("div#content > ul > li:nth-of-type(21) >a")).click();  //y.cssSelector("div#content > ul > li:nth-of-type(21)")
    }

    public static void main (String args[]){
        BaseTests Test = new BaseTests();
        //Test.setUp();
        Test.clickAuthetification();
    }
*/
}
