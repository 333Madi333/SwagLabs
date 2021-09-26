Feature: Home page scenarios

  Background:
    Given  I navigate to LoginPage
    When  I input "Username" as "standard_user"
    And  I input "Password" as "secret_sauce"
    And I click Login button

  Scenario: Verify there are total of 6 items on the page
    When I open Home page I should see 6 items on the page


  Scenario: Verify Add to Cart button toggles to Remove when clicked
    When I click Add to Cart button toggle should change Remove

  Scenario: Verify Twitter is working
    When I click Twitter button
    Then Title of the page should be Twitter
  Scenario: Verify FaceBook is working
    When I click FaceBook button
    Then Title of the page should be Sauce Labs | Facebook
  Scenario: Verify LinkedIn is working
    When I click LinkedIn button
    Then Title of the page should be Sign In | LinkedIn