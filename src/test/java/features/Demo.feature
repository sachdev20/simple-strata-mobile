Feature: Sign up to application

  Scenario: User register in to application
    And I enter username and password on login page
    And I click on login button on login page
    Then I click on left navigation icon
    And I select organisation tab from left panel
    And I create a new function under my organisation
    And I verify that new function has been created