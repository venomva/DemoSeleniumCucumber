Feature: Shadow DOM Module

  As a QA engineer testing the Testver Playground
  I want to verify Shadow DOM interactions work correctly
  So that I can ensure open shadow roots, closed shadow roots, web components with slots, and nested shadow roots function properly

  @shadow @smoke
  Scenario: Shadow DOM page loads with all shadow DOM types
    Given I navigate to the shadow DOM page
    Then the open shadow root section should be visible
    And the closed shadow root section should be visible
    And the web component with slot section should be visible
    And the nested shadow roots section should be visible
