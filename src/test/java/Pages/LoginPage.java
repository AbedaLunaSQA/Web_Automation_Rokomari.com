package Pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class LoginPage extends BasePage {

    HomePage feedpage = new HomePage();

    public String login_page_url = "https://www.rokomari.com/login";
    public By google_login_btn = By.xpath("//button[normalize-space()='Google']");
    public By google_email_input_field = By.xpath("//input[@id='identifierId']");
    public String email = "testerfanfare@gmail.com";
    public By google_password_input_field = By.xpath("");
    public String password = "fanfare367542";
    public By next_btn = By.xpath("//span[normalize-space()='Next']");
    public By email_input_field = By.xpath("//input[@placeholder='Email or phone']");
    public By next_btn_after_email = By.xpath("//button[@id='js--btn-next']");
    public By login_after_email_otp_btn = By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");
    public By resend_otp_btn = By.xpath("//button[@id='resend-otp']");


    public void navigateToLoginPage() {

        feedpage.loadAnWebpage(feedpage.home_page_url);

        clickOneElement(feedpage.login_btn);

    }

    public boolean is_element_visible(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }

    }
    public void doLogOut(){
        HomePage homePage =  new HomePage();
        homePage.getElement(homePage.user_profile).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        homePage.getElement(homePage.logout_btn).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
}
