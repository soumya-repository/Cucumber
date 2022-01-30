package util;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContextSetup {
    public String homePageText;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;


    public TestContextSetup() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.getDriver());
        genericUtils = new GenericUtils(testBase.getDriver());
    }
}
