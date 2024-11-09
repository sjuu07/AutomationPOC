Feature: Navigate to a URL

  @smoke
  Scenario: Navigate to Google homepage
    Given user opens the browser
    When user navigates to "https://www.google.com"
    Then the page title should contain "Google"