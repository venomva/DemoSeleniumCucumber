Feature: Modals, Alerts & Toasts Module

  As a QA engineer testing the Testver Playground
  I want to verify dialogs, modals, and notifications work correctly
  So that I can ensure native dialogs, custom modals, toasts, banners, and cookie consent function properly

  @dialogs @smoke
  Scenario: Dialogs page loads with all dialog types
    Given I navigate to the dialogs page
    Then the native browser dialogs section should be visible
    And the custom modal section should be visible
    And the toast notifications section should be visible
    And the sticky banner section should be visible
    And the cookie consent section should be visible
    And the confirmation before delete section should be visible

  @dialogs
  Scenario: Open and close custom modal
    Given I navigate to the dialogs page
    When I click the open modal button
    Then a custom modal should be displayed
    When I close the modal
    Then the modal should no longer be displayed

  @dialogs
  Scenario: Show toast notifications
    Given I navigate to the dialogs page
    When I click the info toast button
    Then an info toast notification should appear
    When I click the success toast button
    Then a success toast notification should appear
    When I click the warning toast button
    Then a warning toast notification should appear
    When I click the error toast button
    Then an error toast notification should appear

  @dialogs
  Scenario: Show and dismiss sticky banner
    Given I navigate to the dialogs page
    When I click the show announcement banner button
    Then a sticky banner should be displayed
    When I dismiss the banner
    Then the banner should no longer be displayed

  @dialogs
  Scenario: Show and accept cookie consent
    Given I navigate to the dialogs page
    When I click the show cookie banner button
    Then a cookie consent banner should be displayed
    When I accept the cookie consent
    Then the cookie banner should be dismissed

  @dialogs
  Scenario: Confirmation before delete
    Given I navigate to the dialogs page
    When I click the delete resource button
    Then a confirmation dialog should appear
