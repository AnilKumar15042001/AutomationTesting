Feature: AddEmployee

  Scenario: Successful add a employee in AddEmployee page
    Given user launch the chrome browser
    When user enter url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user enter username as "Admin"
    And user enter password as "admin123"
    And click on OrangeHrm login button
    Then page title should be displayed as "OrangeHRM"
    When user click on PIM module
    When user click on AddEmployee button
    Then "Add Employee" page should be  opened
    When user fill the textboxes "<First Name>"  "<Middle Name>" "<Last Name>" "<Employee Id>"
    When user click on save button
    Then customer details should be added successfully and page displayed as "Personal Details"
    When click on logout button
    Then close the browser 
    Examples: 
      | First Name | Middle Name | Last Name   | Employee Id |
      | Anil       | Kumar       | Uttarakabat |        5222 |
      | Babu | anil | ab | 1504 |
   
    