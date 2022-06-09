Feature: feature to test login functionality

  Scenario: Check login feature
    Given User is on login page
    When user enter UN and PWD
    And clicks on login button
    Then user is navigated to Home Page
