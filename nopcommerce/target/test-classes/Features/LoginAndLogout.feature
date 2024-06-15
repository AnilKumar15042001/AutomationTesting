Feature: Login and Logout Functionality

  Scenario: User successful login with valid credentials
    Given User launch the chrome browser
    When User enter url as "https://demo.nopcommerce.com/"
    Then Page title should be displayed as "nopCommerce demo store"
    When User click on login link
    Then Page title should be displayed as "nopCommerce demo store. Login"
    And Retrieve the heading of the login page
    When User enter email as "aniluttarakabat@gmail.com" and password as "Anil1504"
    And User click on login button
    Then Login successfully done and user seen the home page
    When User click on logout link
    Then User close the browser
    
  Scenario Outline: User Unsuccessful login with invalid credentials
    Given User launch the chrome browser
    When User enter url as "https://demo.nopcommerce.com/"
    Then Page title should be displayed as "nopCommerce demo store"
    When User click on login link
    Then Page title should be displayed as "nopCommerce demo store. Login"
    And Retrieve the heading of the login page
    When User enter email as "<Email>" and password as "<Password>"
    And User click on login button
    Then Login successfully done and user seen the home page
    When User click on logout link
    Then User close the browser
    Examples:
    | Email | Password |
    | a@gmail.com | Anil1504 |
    | aniluttarakabat@gmail.com | 113554464 |
    | ghkgsk@gmail.com | 13554646 |
    | | Anil@1504 |
    | aniluttarakabat@gmail.com | |
    | | |
