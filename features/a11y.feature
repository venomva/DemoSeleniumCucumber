Feature: Accessibility Module

  As a QA engineer testing the Testver Playground
  I want to verify accessibility features work correctly
  So that I can ensure ARIA-labeled buttons, screen-reader text, live regions, tabbable forms, expanded buttons, and broken ARIA cases are handled properly

  @a11y @smoke
  Scenario: Accessibility page loads with all a11y features
    Given I navigate to the accessibility page
    Then the ARIA-labeled icon button should be visible
    And the screen-reader only text section should be visible
    And the ARIA live region section should be visible
    And the tabbable form section should be visible
    And the ARIA expanded button section should be visible
    And the broken ARIA section should be visible

  @a11y
  Scenario: Click ARIA-labeled icon button
    Given I navigate to the accessibility page
    When I click the ARIA-labeled favorites button
    Then the favorites action should be registered

  @a11y
  Scenario: Update ARIA live region
    Given I navigate to the accessibility page
    When I click the update status button
    Then the live region should update with new status

  @a11y
  Scenario: Toggle ARIA expanded button
    Given I navigate to the accessibility page
    When I click the show details button
    Then the details section should expand
    When I click the show details button again
    Then the details section should collapse
