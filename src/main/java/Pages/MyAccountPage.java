package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage {
    private WebDriver driver;
    BasePage bp;
    private String myaccount = "MY ACCOUNT";

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    private By myAccount = By.xpath("//*[@id=\"center_column\"]/h1");

    public void VerifyAccountRegistered(){
        bp = new BasePage(driver);
        Assert.assertEquals(bp.GetElementText(myAccount),myaccount);
    }
}
