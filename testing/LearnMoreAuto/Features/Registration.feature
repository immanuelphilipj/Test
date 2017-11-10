
Feature: To test a combination of scenario and scenario outline
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
    But User should have "UserName" in right "Password"  

