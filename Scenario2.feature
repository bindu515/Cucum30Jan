Feature: TestMe App

  Scenario Outline: Login
    When user provides "<user>" and "<password>" as credentials
    Then Login is successful

    Examples: 
      | user    | password    |
      | Lalitha | password123 |
