package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    private By Email = By.id("email_create");
    private By CreateAnAccount = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span");



    public void CreateNewAccount(String mail){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
        driver.findElement(Email).clear();
        driver.findElement(Email).sendKeys(mail);
        driver.findElement(CreateAnAccount).click();
    }
}
