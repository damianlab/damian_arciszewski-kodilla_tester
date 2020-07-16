Feature: Display balance
  Scenario Outline: User checks the balance of an account in credit
    Given my account has been credited with <money>
    When I check my balance
    Then I should see that my balance is <balance>

    Examples:
      | money | balance |
      | 200  |   200   |