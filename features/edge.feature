Feature: Edge Cases Module

  As a QA engineer testing the Testver Playground
  I want to verify edge case handling works correctly
  So that I can ensure stale elements, scrolling, intercepted clicks, animations, disabled-looking elements, auto-focus, iframe-blocked focus, and scroll-locking modals are handled properly

  @edge @smoke
  Scenario: Edge cases page loads with all edge case types
    Given I navigate to the edge cases page
    Then the stale element section should be visible
    And the scrolled out of view section should be visible
    And the click intercepted section should be visible
    And the animated transition section should be visible
    And the disabled-looking section should be visible
    And the auto-focus section should be visible
    And the modal that locks scroll section should be visible

  @edge
  Scenario: Handle stale element re-render
    Given I navigate to the edge cases page
    When I click the stale element button
    Then the element should be replaced and the new element should be clickable

  @edge
  Scenario: Scroll to element out of view
    Given I navigate to the edge cases page
    When I scroll to the bottom button
    Then the bottom button should be clickable

  @edge
  Scenario: Click below sticky header
    Given I navigate to the edge cases page
    When I click the button below the sticky header
    Then the click should be registered

  @edge
  Scenario: Animated panel toggle
    Given I navigate to the edge cases page
    When I click the toggle panel button
    Then the panel should animate open
    When I click the toggle panel button again
    Then the panel should animate closed

  @edge
  Scenario: Open modal that locks scroll
    Given I navigate to the edge cases page
    When I click the open locking modal button
    Then a modal that locks scroll should be displayed
