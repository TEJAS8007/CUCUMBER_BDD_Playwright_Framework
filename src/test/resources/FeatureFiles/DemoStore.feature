Feature:Checking Ecommerce webApplication
@HomePage
Scenario:Home Functionality Validation
Given user should navigate to "https://www.demoblaze.com/"
When user should validate title as "STORE"
And User shoulg validate url as "https://www.demoblaze.com/"
And user should verify products displayed on HomePage
And user should Evaluate Home Page logo
And user should verify Footer Content
When user validate HyperLink on WebPage
Then Home Page Validation is Complete 

@Login
Scenario:Performing signup and Login Action
Given user should have completely validated Home Page
When user should click on login Logo
Then user should perform login Action
Then login action should be completed

