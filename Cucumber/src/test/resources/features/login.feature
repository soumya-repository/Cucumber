Feature: Application login

Scenario: Home Page Default login
Given User is on landing page
When User Enters Username
And User Enters Password
And User clicks on login button
Then User Should be navigated to Home Page

