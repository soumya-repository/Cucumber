package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.OfferPage;
import util.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefinition {
    public TestContextSetup testContextSetup;
    public String offerPageText;

    public OfferPageStepDefinition(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }


    @Then("User search with same short name {string} in offer page")
    public void user_search_with_same_short_name_in_offer_page(String shortName) throws InterruptedException {
        OfferPage offerPage = testContextSetup.pageObjectManager.getOfferPageObject();
        offerPage.navigateToOfferPage();
        offerPage.search(shortName);
        Thread.sleep(1000);
        offerPageText = offerPage.getSearchResult();
        System.out.println("Search text is : "+offerPageText);
    }

    @Then("Offer page search text should be similar to home page search text")
    public void offer_page_search_text_should_be_similar_to_home_page_search_text() {
        Assert.assertEquals(offerPageText,testContextSetup.homePageText);
    }
}
