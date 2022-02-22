package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExerciceChapter3 {

    private WebDriver driver;

    public void exerciceChapter3(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();  // or maximize() or fullscreen() or setSize(new Dimension(375,812)) = mobile

        WebElement ShiftingContent = driver.findElement(By.linkText("Shifting Content"));  //.cssSelector("a[href='/shifting_content']")
        ShiftingContent.click();

        WebElement Example1MenuElement = driver.findElement(By.linkText("Example 1: Menu Element"));  //cssSelector("a[href='/shifting_content/menu']")
        Example1MenuElement.click();

        List<WebElement> linksUlLi = driver.findElements(By.cssSelector("div#content > div > ul > li"));
        System.out.println("The total number of links in the Ul list is " +linksUlLi.size());

        for( WebElement menu : linksUlLi) {
            System.out.println(menu.getText());
        }

        driver.quit();
    }

    public static void main (String args[]){
        ExerciceChapter3 Test = new ExerciceChapter3();
        Test.exerciceChapter3();
    }

}
