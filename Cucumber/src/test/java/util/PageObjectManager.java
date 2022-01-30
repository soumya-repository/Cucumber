package util;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.OfferPage;

public class PageObjectManager {
    public WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }
    public HomePage getHomePageObject(){
        return new HomePage(driver);
    }

    public OfferPage getOfferPageObject(){
        return new OfferPage(driver);
    }

}
