Feature: Add Employee

  Scenario: Hrmstest
    Given launch browser
    When enter url
    And enter username and password
    And click on login button
    Then home page should be displayed
    When click on add button
    Then page heading should be displayed as "PIM : Add Employee"
    When enter "<last_name>" and "<first_name>"
    And click on save button
    Then page heading should be displayed as "Personal Details"
    When click on logout link
    And close browser
    Examples:
    | last_name | first_name |
    | uttarakabat | anil |
    | uttarakabat | babu |
