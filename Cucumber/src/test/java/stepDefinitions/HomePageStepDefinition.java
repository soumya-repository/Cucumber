package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.HomePage;
import util.TestContextSetup;

public class HomePageStepDefinition {
    public TestContextSetup testContextSetup;
    public String offerPageText;

    public HomePageStepDefinition(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @Given("User is on Green cart home page")
    public void user_is_on_green_cart_home_page() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
        testContextSetup.driver = new ChromeDriver();
        testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    @When("User search with short name {string} and extracted actual name of product")
    public void user_search_with_short_name_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        HomePage homePage = testContextSetup.pageObjectManager.getHomePageObject();
        homePage.search(shortName);
        Thread.sleep(1000);
        testContextSetup.homePageText = homePage.getSearchResult();
        System.out.println("Search text is : "+testContextSetup.homePageText);
    }

}
