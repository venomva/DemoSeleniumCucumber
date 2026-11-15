Feature: Tabs & Accordions Module

  As a QA engineer testing the Testver Playground
  I want to verify tabs, accordions, and navigation widgets work correctly
  So that I can ensure lazy-loaded content, accordion panels, mega menus, and vertical tabs function properly

  @widgets @smoke
  Scenario: Widgets page loads with all widget types
    Given I navigate to the widgets page
    Then the horizontal tabs should be visible
    And the accordion sections should be visible
    And the mega menu trigger should be visible
    And the vertical tabs should be visible

  @widgets
  Scenario: Switch between horizontal tabs
    Given I navigate to the widgets page
    When I click the Overview tab
    Then the Overview content should be displayed
    When I click the Statistics tab
    Then the Statistics content should be displayed
    When I click the Reviews tab
    Then the Reviews content should be displayed
    When I click the Settings tab
    Then the Settings content should be displayed

  @widgets
  Scenario: Accordion expand and collapse
    Given I navigate to the widgets page
    When I click the first accordion section
    Then the first accordion content should be expanded
    When I click the second accordion section
    Then the second accordion content should be expanded

  @widgets
  Scenario: Switch between vertical tabs
    Given I navigate to the widgets page
    When I click the Profile vertical tab
    Then the Profile content should be displayed
    When I click the Security vertical tab
    Then the Security content should be displayed
    When I click the Notifications vertical tab
    Then the Notifications content should be displayed
    When I click the Billing vertical tab
    Then the Billing content should be displayed
