package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class OfferPage {
    WebDriver driver;
    public OfferPage(WebDriver driver){
        this.driver = driver;
    }
    By searchBtn = By.xpath("//input[@type='search']");
    By searchResult = By.xpath("//td[normalize-space()='Tomato']");
    By topDealsBtn = By.linkText("Top Deals");

    public void search(String text){
        driver.findElement(searchBtn).sendKeys(text);
    }

    public String getSearchResult(){
        return driver.findElement(searchResult).getText().trim();
    }

    public void navigateToOfferPage(){
        driver.findElement(topDealsBtn).click();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        String parent = itr.next();
        String child = itr.next();
        driver.switchTo().window(child);
    }
}
