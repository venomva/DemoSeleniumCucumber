Feature: i18n & RTL Module

  As a QA engineer testing the Testver Playground
  I want to verify internationalization and RTL support works correctly
  So that I can ensure language selection and special character input function properly

  @i18n @smoke
  Scenario: i18n page loads with language selection and unicode input
    Given I navigate to the i18n page
    Then the language selection section should be visible
    And the special characters input should be visible
    And the CTA button should be visible

  @i18n
  Scenario: Type special characters and unicode
    Given I navigate to the i18n page
    When I type unicode text "你好, مرحبا, 🚀, café" in the unicode input
    Then the unicode text should be entered correctly
