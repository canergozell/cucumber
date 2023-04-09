Feature: Login Functionalities
  @smoke1
  Scenario: Valid Admin login
   # Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully
    #And user clicks on save button

  @smoke2
  Scenario: Valid Admin login
   # Given open the browser and launch HRMS application
    When user enters valid "ADMIN" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully
    #And user clicks on save button

