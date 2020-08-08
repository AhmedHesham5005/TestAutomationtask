package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    private WebDriver driver;
    // Create constructor
    public BasePage(WebDriver driver) {
       this.driver = driver;
    }


    public void ClickOnElement (By by){
        driver.findElement(by).click();
    }

    public void SendChars(By by, String Text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(Text);
    }

    public void SelectFromDDLByIndex(By by, int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public void SelectFromDDLByVisibleText(By by, String visibleText){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(visibleText);
    }

    public String GetElementText (By by){
        return driver.findElement(by).getText();
    }

}
