Feature: Hrms

  Scenario: Hrmstest
    Given launch browser
    When enter url
    And enter username and password
    And click on login button
    Then home page should be displayed
    When click on logout link
    And close browser

