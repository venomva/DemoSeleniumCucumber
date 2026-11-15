Feature: Drag & Drop Module

  As a QA engineer testing the Testver Playground
  I want to verify drag and drop interactions work correctly
  So that I can ensure sortable lists, kanban boards, and resizable splitters function properly

  @dragdrop @smoke
  Scenario: Drag and drop page loads with all interaction types
    Given I navigate to the drag and drop page
    Then the sortable list section should be visible
    And the kanban board section should be visible
    And the resizable splitter section should be visible
