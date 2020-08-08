package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By SigninBtn = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");

    public void ClickOnSignInBtn() {
       this.driver.findElement(SigninBtn).click();
    }

}
