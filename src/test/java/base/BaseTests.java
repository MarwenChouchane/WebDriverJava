package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.home.HomePage;
import utiles.EventReporter;
import utiles.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseTests {

    //private WebDriver driver;
    private EventFiringWebDriver driver;
    protected HomePage homePage ;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //driver = new ChromeDriver();
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
        goHome();
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
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void recordFailure (ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            //System.out.println("Screenshot taken : "+ screenshot.getAbsolutePath());
            try {
                Files.move(screenshot, new File("C:\\Users\\Administrator\\IdeaProjects\\WebDriverJava\\resources\\scrennshot\\" +result.getName() +".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
