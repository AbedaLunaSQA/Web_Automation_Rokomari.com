package Pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage {

    public By login_btn = By.xpath("//*[@id=\"js--main-header\"]/div[2]/div/div[3]/div/div[1]/a");
    public String home_page_url = "https://www.rokomari.com/book";
    public By writer_hover_btn = By.xpath("//a[@id='js--authors']");
    public By humayun_photo = By.xpath("//div[@class='authorListItem']//a//div//img[@alt='Humayun Ahmed']");
    public String writer_url = "https://www.rokomari.com/book/authors?ref=sm_p0";
    public String humayun_page_url = "https://www.rokomari.com/book/author/1/humayun-ahmed";
    public By category_search = By.xpath("//input[@data-search-target='#js--categoryIds']");
    public By shomokalin_shomogro_filter = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public String shomokalin_shomogro_page_url = "https://www.rokomari.com/book/author/1/humayun-ahmed?xyz=&categoryIds=677&priceRange=0to45100&discountRange=0to30";
    public By next_page_arrow_btn = By.xpath("//i[@class='ion-chevron-right']");
    public By reset_filter = By.xpath("//a[normalize-space()='Reset Filter']");
    public By aj_himur_biye_book_card = By.xpath("/html/body/div[8]/div/div/div/section[3]/div[2]/div/div[7]");
    public By add_to_cart = By.xpath("//a[@class='align-items-center js--add-to-cart js--add-to-cart-desc details-splash-effect-btn-central']");
    public By cart_icon = By.xpath("//img[@alt='cart']");
    public String cart_page_url = "https://www.rokomari.com/cart";
    public By proceed_to_checkout = By.xpath("//span[normalize-space()='Proceed to Checkout']");
    public By user_profile = By.xpath("//a[normalize-space()='Hello, Sign in']");
    public By user_name = By.xpath("//span[@class='user-name']");
    public By book_preference_modal = By.xpath("(//div[@id='js--user-choice-main-body'])[1]");
    public By skip_btn_modal = By.xpath("//button[@id='js--skip-user-choice-modal']");
    public By cross_btn_for_ad = By.xpath("//*[@id=\"js--entry-popup\"]/div[1]/button/i");
    public By publisher_search = By.xpath("//input[@data-search-target='#js--publisherIds']");
    public By writer_header = By.xpath("//h1[contains(text(),'জনপ্রিয় লেখকগণ')]");
    public By filter_block_ad_remove = By.xpath("/html/body/header/a/button/span");
    public By search_from_filter_page = By.xpath("//input[@id='js--search']");
    public String book_name = "আজ হিমুর বিয়ে";
    public By book_name_hover = By.xpath("//p[contains(text(),'আজ হিমুর বিয়ে')]");
    public String book_page_url = "https://www.rokomari.com/book/1133/aj-himur-biye";
    public String category_validation = "সমকালীন উপন্যাস";
    public By go_to_cart_btn = By.xpath("//div[@id='js--details-btn-area']//a[@class='add-to-cart-btn-details-page js--goto-cart-btn']");
    public By go_to_cart_from_modal = By.xpath("//a[@class='btn btn-place-order ml-2']//span[contains(text(),'Go To Cart')]");
    public By book_available_amount = By.xpath("//p[@class='qty-message']");
    public By total_price = By.xpath("//span[@id='js--cart-total-price']");
    public By book_price = By.xpath("//span[@class='js--prc']");
    public By cart_page_book = By.xpath("//a[contains(text(),'আজ হিমুর বিয়ে')]");



    public By logout_btn = By.xpath("//a[normalize-space()='Sign Out']");

    public void doLogout(){

        if(getElement(logout_btn).isDisplayed())
            clickOneElement(logout_btn);
    }

}
