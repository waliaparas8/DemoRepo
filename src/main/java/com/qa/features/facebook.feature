Feature: Facebook Application Test
  Scenario: Validate Facebook Home Page Test
    Given user opens browser
    Then user is on login page
    Then user logged in to app
    Then validate home page title
    Then validate logged in username