Feature: Canvas & SVG Module

  As a QA engineer testing the Testver Playground
  I want to verify canvas and SVG interactions work correctly
  So that I can ensure drawing pad, signature pad, and interactive SVG function properly

  @canvas @smoke
  Scenario: Canvas page loads with all canvas types
    Given I navigate to the canvas page
    Then the drawing pad section should be visible
    And the signature pad section should be visible
    And the interactive SVG section should be visible

  @canvas
  Scenario: Clear and save drawing canvas
    Given I navigate to the canvas page
    When I click the clear canvas button
    Then the drawing canvas should be cleared
    When I click the save as PNG button
    Then the canvas should be saved as PNG

  @canvas
  Scenario: Clear and confirm signature
    Given I navigate to the canvas page
    When I click the clear signature button
    Then the signature pad should be cleared
    When I click the confirm signature button
    Then the signature should be confirmed
