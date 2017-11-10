Feature: To test scenario outline 
  Scenario Outline: To test Examples
    Given User is logged into application
    And User enter "<name>" and "<password>"
    Then User is logged in successfully.

    Examples: 
      | name    | password |
      | Tester1 | pass123  |
      | Tester2 | pass@123 |
      | Tester 3| pass@333 |
      