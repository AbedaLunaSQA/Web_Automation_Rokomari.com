package Pages;

import org.openqa.selenium.By;

public class ShippingInfoPage extends BasePage{

    public By pickup_place = By.xpath("//div[@class='delivery__location d-flex align-item-center mb-3']//label[@for='home'][normalize-space()='Home']");
    public String shipping_page_url = "https://www.rokomari.com/shipping?isgift=0&isShowShippingInCartPage=false&selectedAddressId=&areaId=";
    public By name_input_field = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By phone_number_input_field = By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By alternative_number_input_field = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
    public By address_input_field = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
    public By cod = By.xpath("//label[@for='COD']");
    public By privacy_policy = By.xpath("//label[contains(text(),'রকমারির শর্তাবলীতে সম্মতি প্রদান করছি ৷')]");
    public String name = "Luna";
    public String phone_number = "01123456789";
    public String alt_phone_number = "01987654321";
    public String address = "Dhaka- 1207";
    public By delete_product_from_cart = By.xpath("//div[@id='js--cart-product-item-1133']//img[@alt='trash']");

}
