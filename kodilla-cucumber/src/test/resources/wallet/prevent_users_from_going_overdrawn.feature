Feature: Prevent users from going overdrawn
  Scenario: User wants to withdraw more than balance is
    Given I have credited $100
    When I withdraw $200
    Then Nothing should be dispensed
    And I should be told that I have insufficient funds in my account