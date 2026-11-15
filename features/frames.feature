Feature: iFrames & Windows Module

  As a QA engineer testing the Testver Playground
  I want to verify iframe and window handling works correctly
  So that I can ensure same-origin iframes, nested iframes, sandboxed iframes, and new windows function properly

  @frames @smoke
  Scenario: Frames page loads with all frame types
    Given I navigate to the frames page
    Then the same-origin iframe section should be visible
    And the nested iframes section should be visible
    And the sandboxed iframe section should be visible
    And the new tab/window section should be visible

  @frames
  Scenario: Open popup window
    Given I navigate to the frames page
    When I click the open popup window button
    Then a new popup window should open
