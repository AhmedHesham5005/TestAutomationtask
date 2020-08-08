package Tests;

import Pages.HomePage;

import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegisterationPage;
import org.testng.annotations.Test;

public class Registration extends BaseTest{
    HomePage Hpage;
    LoginPage Lpage;
    RegisterationPage Rpage;
    MyAccountPage Myaccount;

    @Test
    public void RegisterNewProfile() {
        Hpage = new HomePage(driver);
        Hpage.ClickOnSignInBtn();

        Lpage = new LoginPage(driver);
        Lpage.CreateNewAccount("AhmedAhmed121214@gmail.com");

        Rpage = new RegisterationPage(driver);
        Rpage.FillRegistrationForm("Omar", "EL-sayed", "KosomAgile","Microsoft", "LasVegas","LasVegas2","Cairo","California","11841","United States","More Information is required","01118888245","01019884890" );

        Myaccount = new MyAccountPage(driver);
        Myaccount.VerifyAccountRegistered();



    }
}
