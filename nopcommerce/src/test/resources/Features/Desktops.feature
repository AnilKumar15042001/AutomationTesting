Feature: Desktops

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

  Scenario: Select the product using valid credentials
    When Perform mouse over action on Computers module and click on Desktop sub-module
    Then Page title should be displayed as "nopCommerce demo store. Desktops"
    And Retrieve the heading of the Desktop page
    When User select the Sort by and Display drop down box
    And Click on link of the particular item
    Then Verify name of the item
    When Select the required fields
      | field     | value                                 |
      | Processor | 2.2 GHz Intel Pentium Dual-Core E2200 |
      | RAM       | 8GB [+$60.00]                         |
      | HDD       | 400 GB [+$100.00] |
      | OS        | Vista Premium [+$60.00]               |
      | Software  | Microsoft Office [+$50.00]            |
    And User enter the quantity of the item
    Then Retrieve the price
    When User click on ADD TO CART button
    Then Expected result should be displayed as "The product has been added to your shopping cart"
    When User click on logout link
    Then User close the browser
