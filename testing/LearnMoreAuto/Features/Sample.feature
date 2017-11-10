Feature: Login functionality for demoqa.com

  Background: These are run in every steps

  # Given User is on http://toolsqa.com
  # When User clicks on MyAccount links
  Scenario: Verify that user is able to successfully login to demoqa website
    Given User is on http://toolsqa.com
    # When User clicks on MyAccount links
    And User logs in using valid username Cucumber and password test1234
    Then User is able to login successfully

  Scenario: Verify that user is able to login
    Given User navigates to http://Google.com
    When User fills in the registration
      | Tester   |
      | Tester1  |
      | Tester 2 |
      | Tester 3 |
    And User enter "Name" and "Password"  
    Then User could understand internal array
      | FirstName | Dev 1 |
      | LastName  | Dev 2 | 

# Feature: This is to test Scenario outline

