@tag
Feature: Login functionality

  @tag1
  Scenario: User login into application with valid credentials
    Given User launch the browser and enter url
    When User enter username and password then click on login button
    Then User should see the Dashboard page
