package Pages;

import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class BasePage extends DriverSetup {

        public WebElement getElement (By locator) {

            return getDriver().findElement(locator);
        }

        public void clickOneElement (By locator) {
            getElement(locator).click();}

        public void writeOneElement (By locator, String text) {
            getElement(locator).sendKeys(text);}

        public void loadAnWebpage (String url){

            getDriver().get(url);
        }

        public String getPageTitle (){

            return getDriver().getTitle();
        }


    }
