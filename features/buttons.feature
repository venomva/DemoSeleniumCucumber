Feature: Buttons & Interactions Module

  As a QA engineer testing the Testver Playground
  I want to verify all button interactions work correctly
  So that I can ensure click variants, hover, loading states, and button groups function properly

  @buttons @smoke
  Scenario: Buttons page loads with all button types
    Given I navigate to the buttons page
    Then the single click button should be visible
    And the double click button should be visible
    And the right click button should be visible
    And the long press button should be visible
    And the hover button should be visible
    And the loading button should be visible
    And the toggle button should be visible
    And the button group should be visible
    And the icon-only button should be visible

  @buttons
  Scenario: Single click button works
    Given I navigate to the buttons page
    When I click the single click button
    Then a click result should be displayed

  @buttons
  Scenario: Toggle button toggles state
    Given I navigate to the buttons page
    When I click the toggle button
    Then the toggle state should change
    When I click the toggle button again
    Then the toggle state should return to original

  @buttons
  Scenario: Button group selection
    Given I navigate to the buttons page
    When I click the left button in the group
    Then the left button should be selected
    When I click the middle button in the group
    Then the middle button should be selected
    When I click the right button in the group
    Then the right button should be selected
