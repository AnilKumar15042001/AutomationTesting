Feature: Digital Downloads

  Background: Common steps
    Given User launch the chrome browser
    When User enter url as "https://demo.nopcommerce.com/"
    Then Page title should be displayed as "nopCommerce demo store"
    When User click on login link
    Then Page title should be displayed as "nopCommerce demo store. Login"
    And Retrieve the heading of the login page
    When User enter email as "aniluttarakabat@gmail.com" and password as "Anil1504"
    And User click on login button
    Then Login successfully done and user seen the home page

  Scenario: User succesfully add the product in shoping cart
    When User click on Digital downloads module
    Then Page title should be displayed as "nopCommerce demo store. Digital downloads"
    And Page heading should be displayed as "Digital downloads"
    When User select the "<sortby>" and "<display>" dropdown box
    And User click on particular product
    Then Heading of product page should be dispalyed
    When User enter price as "<Price>" and Quantity as "<Quantity>"
    And User click on AddToCart button
    Then Success message should be displayed as "The product has been added to your shopping cart"
    Then User close the browser
    Examples: 
    | sortby | display | Price | Quantity |
    | Name: A to Z | 9 | 20 | 2 |
    | Price: High to Low | 6 | 50 | 5 |
    | Created on | 3 | 200 | 3 |