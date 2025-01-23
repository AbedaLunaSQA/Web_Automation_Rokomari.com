package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;


public class TestLoginPage extends DriverSetup {

    LoginPage loginpage = new LoginPage();
    HomePage homepage = new HomePage();


    @Test
    public void emailLogin() throws InterruptedException {

        getDriver().get("https://www.rokomari.com/book");
        if(homepage.getElement(homepage.cross_btn_for_ad).isDisplayed())
            homepage.getElement(homepage.cross_btn_for_ad).click();
        homepage.getElement(homepage.user_profile).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginpage.getElement(loginpage.email_input_field).sendKeys(loginpage.email);
        loginpage.getElement(loginpage.next_btn_after_email).click();
        Thread.sleep(30000);
        loginpage.getElement(loginpage.login_after_email_otp_btn).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        if(homepage.getElement(homepage.skip_btn_modal).isDisplayed())
            homepage.getElement(homepage.skip_btn_modal).click();


//        loginpage.doLogOut();


    }










//    @Test
//
//    public void googleLogin(){
//
//        if(homepage.getElement(homepage.cross_btn_for_ad).isDisplayed())
//            homepage.getElement(homepage.cross_btn_for_ad).click();
//        homepage.getElement(homepage.user_profile).click();
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        loginpage.getElement(loginpage.google_login_btn).click();
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
//
//        if(homepage.getElement(homepage.skip_btn_modal).isDisplayed())
//            homepage.getElement(homepage.skip_btn_modal).click();
//
//        loginpage.doLogOut();
//    }
}
