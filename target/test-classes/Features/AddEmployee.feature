Feature: Employee

  @employeePage @smoke
  Scenario: Adding a new Employee
    #Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    When user clicks in PIM option
    And user click on add employee button
    And user enters firstname and middle name and  lastname
    #And user enters firstname and middle name and  lastname
    #And user clicks on save button