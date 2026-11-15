Feature: Form Elements Module

  As a QA engineer testing the Testver Playground
  I want to verify form elements work correctly
  So that I can ensure all input types, choices, pickers, and validation function properly

  @forms @smoke
  Scenario: Form elements page loads with standard inputs
    Given I navigate to the form elements page
    Then the standard inputs tab should be active
    And the form text input should be visible
    And the form email input should be visible
    And the form password input should be visible
    And the form number input should be visible
    And the form tel input should be visible
    And the form url input should be visible
    And the form search input should be visible
    And the form textarea should be visible
    And the readonly field should display "Cannot edit me"
    And the disabled field should be present

  @forms
  Scenario: Fill and submit standard inputs
    Given I navigate to the form elements page
    When I enter text "John Doe" in the text input
    And I enter email "john@example.com" in the email input
    And I enter password "secret123" in the password input
    And I enter number "42" in the number input
    And I enter tel "+1 (555) 123-4567" in the tel input
    And I enter url "https://example.com" in the url input
    And I enter search "test query" in the search input
    And I enter textarea "This is a test message" in the textarea
    And I click the submit button
    Then the form should be submitted successfully

  @forms
  Scenario: Reset form clears all inputs
    Given I navigate to the form elements page
    When I enter text "John Doe" in the text input
    And I enter email "john@example.com" in the email input
    And I click the form reset button
    Then the text input should be empty
    And the email input should be empty
