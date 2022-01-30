Feature: Search and Place Orders for products

Scenario: Search experience validation for both home page and offer page
Given User is on Green cart home page
When User search with short name "tom" and extracted actual name of product
Then User search with same short name "tom" in offer page
And Offer page search text should be similar to home page search text

