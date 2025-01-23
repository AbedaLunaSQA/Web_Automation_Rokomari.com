package TestCases;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ShippingInfoPage;
import Utilities.DriverSetup;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;



public class TestHomePage extends DriverSetup {



    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ShippingInfoPage shippingInfoPage = new ShippingInfoPage();
    BasePage basePage = new BasePage();


    @Test (description = "Find author tile to click")

    public void removeAd() throws InterruptedException {

        getDriver().get(homePage.home_page_url);

        //remove ad
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        getDriver().findElement(homePage.cross_btn_for_ad).isDisplayed();
        if (loginPage.is_element_visible(homePage.cross_btn_for_ad)) {
            getDriver().findElement(homePage.cross_btn_for_ad).click();
        }
        Assert.assertTrue(homePage.getElement(homePage.writer_hover_btn).isDisplayed());

        Thread.sleep(3000);

//        getDriver().findElement(homePage.user_profile).click();
//        getDriver().findElement(loginPage.google_login_btn).click();
//        Thread.sleep(5000);
//        getDriver().findElement(loginPage.google_email_input_field).sendKeys(loginPage.email);
//        Thread.sleep(3000);
//        getDriver().findElement(loginPage.next_btn).click();
//        Thread.sleep(3000);
    }

        @Test
        //go to writer page
        public void writerPageOpen() throws InterruptedException {
            getDriver().findElement(homePage.writer_hover_btn).click();
        Assert.assertTrue(homePage.getElement(homePage.writer_header).isDisplayed());

        Actions actions = new Actions(getDriver());
        WebElement humayun_image = homePage.getElement(homePage.humayun_photo);
        actions.moveToElement(humayun_image).build().perform();
        Thread.sleep(3000);
        actions.click(humayun_image).build().perform();
        Thread.sleep(8000);
        Assert.assertEquals((homePage.humayun_page_url),"https://www.rokomari.com/book/author/1/humayun-ahmed");



    }


}
