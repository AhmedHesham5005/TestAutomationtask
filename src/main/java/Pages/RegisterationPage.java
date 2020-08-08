package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterationPage {

    public WebDriver driver;


    public RegisterationPage(WebDriver driver) {
        this.driver = driver;
    }

    BasePage bp;

    private By Gender = By.xpath("//*[@id=\"id_gender1\"]");
    private By FirstName = By.id("customer_firstname");
    private By LastName = By.id("customer_lastname");
    private By Password = By.id("passwd");
    private By Day = By.id("days");
    private By Month = By.id("months");
    private By Year = By.id("years");
    private By NewsLetter = By.id("newsletter");
    private By SpecialOffers = By.id("optin");
    private By Company = By.id("company");
    private By Address = By.id("address1");
    private By Address2 = By.id("address2");
    private By City = By.id("city");
    private By State = By.id("id_state");
    private By PostalCode = By.id("postcode");
    private By Country = By.id("id_country");
    private By AdditionalInfo = By.id("other");
    private By Home = By.id("phone");
    private By Mobile = By.id("phone_mobile");
    private By RegisterBtn = By.id("submitAccount");



    public void FillRegistrationForm(String Firstname, String Lastname, String PassWord, String company, String address, String address2, String city, String state, String postCode, String country, String info, String home, String mobile) {

        bp = new BasePage(driver);

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Gender));

        bp.ClickOnElement(Gender);

        bp.SendChars(FirstName, Firstname);
        bp.SendChars(LastName, Lastname);
        bp.SendChars(Password, PassWord);

        bp.SelectFromDDLByIndex(Day, 27);
        bp.SelectFromDDLByIndex(Month, 9);
        bp.SelectFromDDLByIndex(Year, 26);

        bp.SendChars(Password, PassWord);

        bp.ClickOnElement(NewsLetter);
        bp.ClickOnElement(SpecialOffers);

        bp.SendChars(Company,company);
        bp.SendChars(Address,address);
        bp.SendChars(Address2,address2);
        bp.SendChars(City,city);

        bp.SelectFromDDLByVisibleText(State,state);

        bp.SendChars(PostalCode,postCode);

        bp.SelectFromDDLByVisibleText(Country,country);

        bp.SendChars(AdditionalInfo,info);
        bp.SendChars(Home,home);
        bp.SendChars(Mobile,mobile);

        bp.ClickOnElement(RegisterBtn);



    }



}
