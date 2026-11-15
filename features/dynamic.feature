Feature: Loaders & Waits Module

  As a QA engineer testing the Testver Playground
  I want to verify dynamic content loading works correctly
  So that I can ensure spinners, skeletons, delayed elements, progress bars, and infinite scroll function properly

  @dynamic @smoke
  Scenario: Dynamic page loads with all loader types
    Given I navigate to the dynamic page
    Then the spinner section should be visible
    And the skeleton loader section should be visible
    And the late element section should be visible
    And the disappearing element section should be visible
    And the progress bar section should be visible
    And the auto-refreshing counter should be visible
    And the infinite scroll section should be visible

  @dynamic
  Scenario: Spinner resolves after configurable delay
    Given I navigate to the dynamic page
    When I set the delay to "1000" milliseconds
    And I click the start spinner button
    Then the spinner should appear and then resolve

  @dynamic
  Scenario: Skeleton loaders transition to real content
    Given I navigate to the dynamic page
    When I click the load content button
    Then skeleton loaders should appear and then show real content

  @dynamic
  Scenario: Element appears after clicking trigger
    Given I navigate to the dynamic page
    When I click the late trigger button
    Then a new element should appear after a delay

  @dynamic
  Scenario: Element disappears after 5 seconds
    Given I navigate to the dynamic page
    When I click the show ephemeral element button
    Then an element should appear and then disappear after 5 seconds

  @dynamic
  Scenario: Progress bar completes
    Given I navigate to the dynamic page
    When I click the start progress button
    Then the progress bar should fill to 100%
