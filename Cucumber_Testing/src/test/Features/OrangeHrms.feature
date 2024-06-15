Feature: OrangeHrm LoginPage

  @smoke @regression
  Scenario: Successful login with valid credentials
    Given user launch the chrome browser
    When user enter url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user enter username as "Admin"
    And user enter password as "admin123"
    And click on OrangeHrm login button
    Then page title should be displayed as "OrangeHRM"
    When click on logout button
    Then page title should be displayed as "OrangeHRM"
    And close the browser
  @regression
  Scenario: unsuccessful login with invalid credentials
    Given user launch the chrome browser
    When user enter url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user enter username as "<username>"
    And user enter password as "<password>"
    And click on OrangeHrm login button
    Then page title should be displayed as "OrangeHRM"
    When click on logout button
    Then page title should be displayed as "OrangeHRM"
    And close the browser

    Examples: 
      | username | password   |
      | Admin    | admin12345 |
      | admin12345 | admin123 |
      | admin123 | admin12345 |
      | Admin |           |
      |          |admin123 |
