Feature: Login page scenarios

  Scenario:  Verify login options
    Given  I navigate to LoginPage
    When  I input "Username" as "standard_user"
    And  I input "Password" as "secret_sauce"
    And I click Login button
    Then Title of the page should be Swag Labs