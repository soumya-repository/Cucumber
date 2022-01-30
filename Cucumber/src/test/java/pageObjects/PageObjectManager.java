package pageObjects;

import org.openqa.selenium.WebDriver;

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
