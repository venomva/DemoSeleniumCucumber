Feature: Locator Challenges Module

  As a QA engineer testing the Testver Playground
  I want to verify locator strategies work correctly
  So that I can ensure stable IDs, dynamic IDs, duplicate IDs, identical siblings, deeply nested DOM, text-only elements, hidden vs visible, and overlapping z-index elements are handled properly

  @locators @smoke
  Scenario: Locator challenges page loads with all challenge types
    Given I navigate to the locator challenges page
    Then the stable IDs section should be visible
    And the dynamic IDs section should be visible
    And the duplicate IDs section should be visible
    And the identical siblings section should be visible
    And the deeply nested DOM section should be visible
    And the text-only section should be visible
    And the hidden vs visible section should be visible
    And the overlapping z-index section should be visible

  @locators
  Scenario: Click stable button by data-testid
    Given I navigate to the locator challenges page
    When I click the stable button
    Then the stable button click should be registered

  @locators
  Scenario: Click deeply nested button
    Given I navigate to the locator challenges page
    When I click the deeply nested button
    Then the deeply nested button click should be registered

  @locators
  Scenario: Click visible submit button
    Given I navigate to the locator challenges page
    When I click the visible submit button
    Then the visible submit click should be registered
