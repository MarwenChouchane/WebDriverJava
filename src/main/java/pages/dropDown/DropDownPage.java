package pages.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    private WebDriver driver ;
    private By dropdownList = By.cssSelector("select#dropdown");

    public DropDownPage (WebDriver driver){
        this.driver = driver;
    }

    /*public void selectFromDropDownList (String options){
        Select dropDownElement = new Select(driver.findElement(dropdownList));
        dropDownElement.selectByVisibleText(options);
    }*/ //est egal à "findDropDown" + selectFromDropDownList"

    public Select findDropDown (){
        return new Select(driver.findElement(dropdownList));
    }

    public void selectFromDropDownList (String options){
        findDropDown().selectByVisibleText(options);
    }

    public List<String> getSelectedoptions (){
        List<WebElement> selectedElements = findDropDown().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
}
