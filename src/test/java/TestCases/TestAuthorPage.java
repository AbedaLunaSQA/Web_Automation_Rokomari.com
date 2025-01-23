package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ShippingInfoPage;
import Utilities.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class TestAuthorPage extends DriverSetup {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ShippingInfoPage shippingInfoPage = new ShippingInfoPage();



    @Test(priority = 1)

    public void CategoryFilter() throws InterruptedException {
        Actions actions = new Actions(getDriver());

//        getDriver().get(homePage.home_page_url);
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        getDriver().findElement(homePage.cross_btn_for_ad).isDisplayed();
//        if (loginPage.is_element_visible(homePage.cross_btn_for_ad)) {
//            getDriver().findElement(homePage.cross_btn_for_ad).click();
//        }
//        getDriver().findElement(homePage.writer_hover_btn).click();
//        WebElement humayun_image = homePage.getElement(homePage.humayun_photo);
//        actions.moveToElement(humayun_image).build().perform();
//        Thread.sleep(3000);
//        actions.click(humayun_image).build().perform();
//        Thread.sleep(8000);


        getDriver().get(homePage.humayun_page_url);

        if(homePage.getElement(homePage.filter_block_ad_remove).isDisplayed())
            homePage.getElement(homePage.filter_block_ad_remove).click();
        WebElement filterSearch = getDriver().findElement(homePage.publisher_search);
        actions.moveToElement(filterSearch).build().perform();
        Thread.sleep(3000);
        getDriver().findElement(homePage.shomokalin_shomogro_filter).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Assert.assertEquals((homePage.shomokalin_shomogro_page_url), "https://www.rokomari.com/book/author/1/humayun-ahmed?xyz=&categoryIds=677&priceRange=0to45100&discountRange=0to30");
    }

    @Test (priority = 2)

    public void searchForBook(){
        Actions actions = new Actions(getDriver());

        homePage.getElement(homePage.search_from_filter_page).sendKeys(homePage.book_name);
        homePage.getElement(homePage.book_name_hover).click();
        Assert.assertEquals((homePage.book_page_url), "https://www.rokomari.com/book/1133/aj-himur-biye");
        Assert.assertEquals((homePage.category_validation), "সমকালীন উপন্যাস");

    }

    @Test (priority = 3)
            public void addToCart() throws InterruptedException {
        Actions actions = new Actions(getDriver());

        homePage.getElement(homePage.cart_icon).click();
        if(shippingInfoPage.getElement(shippingInfoPage.delete_product_from_cart).isDisplayed())
        shippingInfoPage.getElement(shippingInfoPage.delete_product_from_cart).click();
        else{
            System.out.println("cart is empty");
        }
        getDriver().navigate().to(homePage.book_page_url);
        WebElement addToCart = getDriver().findElement(homePage.add_to_cart);
        actions.moveToElement(addToCart).build().perform();
        homePage.getElement(homePage.add_to_cart).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        if(homePage.getElement(homePage.go_to_cart_btn).isDisplayed())
            System.out.println("add to cart replaced by go to cart");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getDriver().switchTo().frame(homePage.getElement(homePage.go_to_cart_from_modal));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homePage.getElement(homePage.go_to_cart_from_modal).click();
        //book availability check
        WebElement countElement = getDriver().findElement(homePage.book_available_amount);

        String countText = countElement.getText();
        int count = Integer.parseInt(countText);

        if (count > 0) {
            System.out.println("Book is available.");
        } else {
            System.out.println("Book is out of stock.");
        }

        //Check total price and book price matches or not
        Assert.assertEquals(homePage.getElement(homePage.total_price), homePage.getElement(homePage.book_price));
        //Check if selected book is showing in cart
        //Assert.assertEquals(homePage.getElement(homePage.book_name), homePage.getElement(homePage.cart_page_book));

        homePage.getElement(homePage.proceed_to_checkout).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


//        WebElement book_card = driver.findElement(homePage.aj_himur_biye_book_card);
//        actions.moveToElement(book_card).build().perform();
//        Thread.sleep(3000);
//        driver.findElement(homePage.add_to_cart).click();
//        Thread.sleep(3000);
//
//        driver.findElement(homePage.cart_icon).click();
//        Thread.sleep(3000);

    }
}
