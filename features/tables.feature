Feature: Tables & Grids Module

  As a QA engineer testing the Testver Playground
  I want to verify tables and grids work correctly
  So that I can ensure rich data tables, static tables, expandable rows, and virtual scrolling function properly

  @tables @smoke
  Scenario: Tables page loads with all table types
    Given I navigate to the tables page
    Then the rich data table tab should be visible
    And the static table tab should be visible
    And the expandable table tab should be visible
    And the virtual table tab should be visible
    And the search input should be visible
    And the category filter should be visible
    And the page size selector should be visible

  @tables
  Scenario: Search in rich data table
    Given I navigate to the tables page
    When I search for "Laptop" in the table
    Then matching results should be displayed

  @tables
  Scenario: Switch between table tabs
    Given I navigate to the tables page
    When I click the static table tab
    Then the static table should be displayed
    When I click the expandable table tab
    Then the expandable table should be displayed
