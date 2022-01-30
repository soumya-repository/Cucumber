package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By searchBtn = By.xpath("//input[@type='search']");
    By searchResult = By.cssSelector("h4.product-name");

    public void search(String text){
        driver.findElement(searchBtn).sendKeys(text);
    }

    public String getSearchResult(){
        return driver.findElement(searchResult).getText().split("-")[0].trim();
    }

}
