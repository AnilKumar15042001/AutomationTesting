Feature: Register module

  @tag1
  Scenario: User registration with valid credentials
  Given User launch the chrome browser
  When User enter url as "https://demo.nopcommerce.com/"
  Then Page title should be displayed as "nopCommerce demo store"
  When User click on REGISTER module
  Then Register page should be displayed with as heading "Register"
  And Page title should be displayed as "nopCommerce demo store. Register"
  When User select the gender as per requirement "<Gender>"
  And User enter First Name as "<First Name>" and Last Name as "<Last Name>"
  And User Select the Correct DOB as "<Day>" "<Month>" "<Year>"
  And User enter Email as "<Email>" and Company Name as "<Company Name>"
  And User select the newsletter checkbox
  And User enter Password as "<Password>" and Confirm Password as "<Confirm Password>"
  And User click on REGISTER button
  Then User should be seen this message "Your registration completed"
  When User click on continue button
  Then User close the browser
  Examples:
  | Gender | First Name | Last Name | Day | Month | Year | Email | Company Name | Password | Confirm Password |
  | male | Anil kumar | Uttarkabat | 15 | April | 2001 | aniluttarakabat@gmail.com | TCS | Anil1504 | Anil1504 |
  
  
  Scenario: User registration with invalid credentials
  Given User launch the chrome browser
  When User enter url as "https://demo.nopcommerce.com/"
  Then Page title should be displayed as "nopCommerce demo store"
  When User click on REGISTER module
  Then Register page should be displayed with as heading "Register"
  And Page title should be displayed as "nopCommerce demo store. Register"
  When User select the gender as per requirement "<Gender>"
  And User enter First Name as "<First Name>" and Last Name as "<Last Name>"
  And User Select the Correct DOB as "<Day>" "<Month>" "<Year>"
  And User enter Email as "<Email>" and Company Name as "<Company Name>"
  And User select the newsletter checkbox
  And User enter Password as "<Password>" and Confirm Password as "<Confirm Password>"
  And User click on REGISTER button
  Then User should be seen the Warning messages
  Then User close the browser
   Examples:
  | Gender | First Name | Last Name | Day | Month | Year | Email | Company Name | Password | Confirm Password |
  | male |  | Uttarkabat | 15 | April | 2001 | aniluttarakabat@gmail.com | AQM | Anil1504 | Anil1504 |
  | male | Anil kumer |  | 15 | April | 2001 | aniluttarakabat@gmail.com | AQM | Anil1504 | Anil1504 |
  | male | Anil kumar | Uttarkabat | 15 | April | 2001 |  | AQM | Anil1504 | Anil1504 |
  | male | Anil kumar | Uttarkabat | 15 | April | 2001 | aniluttarakabat@gmail.com | AQM |  | Anil1504 |
  | male | Anil kumar | Uttarkabat | 15 | April | 2001 | aniluttarakabat@gmail.com | AQM | Anil1504 |  |
  | male | 1345453355 | 334455343  | 15 | April | 2001 | 351434354343536@gmail.com | L&T | 15042001 | 15042001 |