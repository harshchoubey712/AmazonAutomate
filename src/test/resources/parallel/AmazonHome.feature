Feature: Amazon Home Page
  In order to test Amazon Home Page of application
  As a Registered user
  I want to specify the features of home page

Background:
Given user has already logged in to the application
|username|password|
|harshchby@gmail.com|Harshaz@18011991|

@Toppanel
  Scenario: Home Page Top Panel Section
    Given user is on Amazon home page
    Then user gets a Amazon search field
    And username is also displayed next to search field
    And Amazon logo is also displayed
    And Cart link is also displayed
    
@Previousorders    
   Scenario: Check Previous Order Details
    When user clicks on Accounts & Lists links
    And  clicks on Your Orders link
    And  clicks on Orders link
    Then user checks the previous order detials
 
@Cancelledorders
  Scenario: Check Cancelled Order Details
    When user clicks on Accounts & Lists links
    And  clicks on Your Orders link
    And  user clicks on Cancelled Orders link
    Then user checks the cancelled order details


    
   
