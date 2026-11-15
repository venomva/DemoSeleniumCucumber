Feature: Admin Dashboard Module

  As a QA engineer testing the Testver Playground
  I want to verify the admin dashboard works correctly
  So that I can ensure orders by status, notifications, and recent orders are displayed

  @admin @smoke
  Scenario: Admin dashboard page loads with all sections
    Given I navigate to the admin dashboard page
    Then the orders by status section should be visible
    And the notifications section should be visible
    And the recent orders section should be visible
