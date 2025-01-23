package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ShippingInfoPage;
import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import java.time.Duration;

public class TestCartPage extends DriverSetup {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ShippingInfoPage shippingInfoPage = new ShippingInfoPage();

    @Test

    public void shippingAddressInput() throws InterruptedException {

        getDriver().get(shippingInfoPage.shipping_page_url);


        //Home radio button click
        if (!getDriver().findElement(shippingInfoPage.pickup_place).isSelected())
            getDriver().findElement(shippingInfoPage.pickup_place).click();

        //Name input
        getDriver().findElement(shippingInfoPage.name_input_field).clear();
        getDriver().findElement(shippingInfoPage.name_input_field).sendKeys(shippingInfoPage.name);

        //Phone number input
        getDriver().findElement(shippingInfoPage.phone_number_input_field).clear();
        getDriver().findElement(shippingInfoPage.phone_number_input_field).sendKeys(shippingInfoPage.phone_number);
        Thread.sleep(3000);

        //Alternative phone number input
        //getDriver().findElement(shippingInfoPage.alternative_number_input_field).clear();
        getDriver().findElement(shippingInfoPage.alternative_number_input_field).sendKeys(shippingInfoPage.alt_phone_number);
        Thread.sleep(2000);

        //Select country
        WebElement el = getDriver().findElement(By.name("countryId"));
        Select select = new Select(el);
        select.selectByVisibleText("Bangladesh");
        Thread.sleep(3000);

        //Select city
        WebElement el_City = getDriver().findElement(By.name("cityId"));
        Select selectCity = new Select(el_City);
        selectCity.selectByVisibleText("ঢাকা");
        Thread.sleep(3000);

        //Select area
        WebElement el_area = getDriver().findElement(By.name("areaId"));
        Select selectArea = new Select(el_area);
        selectArea.selectByVisibleText("ধানমন্ডি-৩২");
        Thread.sleep(3000);

        //Address input
        getDriver().findElement(shippingInfoPage.address_input_field).clear();
        getDriver().findElement(shippingInfoPage.address_input_field).sendKeys(shippingInfoPage.address);
        Thread.sleep(3000);

        //COD radio button select
        Actions actions = new Actions(getDriver());
        WebElement COD = getDriver().findElement(shippingInfoPage.cod);
        actions.moveToElement(COD).build().perform();
        if(!getDriver().findElement(shippingInfoPage.cod).isSelected())
            getDriver().findElement(shippingInfoPage.cod).click();
        Thread.sleep(2000);

        //Pivacy policy check
        WebElement privacyPolicy = getDriver().findElement(shippingInfoPage.privacy_policy);
        actions.moveToElement(privacyPolicy).build().perform();
        if(!getDriver().findElement(shippingInfoPage.privacy_policy).isSelected())
            actions.doubleClick(privacyPolicy);
            //getDriver().findElement(shippingInfoPage.privacy_policy).click();
//        else{
//            actions.doubleClick(privacyPolicy);
//        }
        Thread.sleep(3000);

        //Logout
        getDriver().findElement(homePage.user_name).click();
        Thread.sleep(3000);
        getDriver().findElement(homePage.logout_btn).click();





    }
}
