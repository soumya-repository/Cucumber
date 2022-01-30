package util;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {
    public WebDriver driver;
    public String homePageText;
    public PageObjectManager pageObjectManager;


    public TestContextSetup(){
        pageObjectManager = new PageObjectManager(driver);
    }
}
