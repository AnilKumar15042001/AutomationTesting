@tag
Feature: Amazon AddToCart functionality


	Background: Add items to cart in Amazon application with using scenario outline and excel
	Given User launch the browser
	And User enter url to the browser as "https://www.amazon.in/"

  #@tag1
  #Scenario: User login into application with valid credentials
    #Given User launch the browser and enter url
    #When User enter username and password then click on login button
    #Then User should see the Dashboard page
     
  Scenario Outline: Add items to cart using Outline approach
    When User entered product name as "<ProductName>" in search text field and click on search button
    Then User should be displayed Resluts in "Results" page 
    When User click on first item of results page and select quantity as "<Quantity>"
    And User click on AddToCart button
    And User click on cart button
    Then User should be displayed page heading as "Shopping Cart"
    Then User validate item price and quantity 
    And User close the browser
    
    Examples:
    | ProductName | Quantity |
    #| shoes | 2 |
    #| mobile | 2 |
    #| shirt | 3 |
    #| pant | 2 |
    #| mouse | 1 |
    #| laptop | 1 |
    #| t-shirt | 3 |
    #| watch | 2 |
    | bag | 2 |
    | cap | 3 |
    
