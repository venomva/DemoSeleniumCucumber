Feature: Testver Playground Homepage

  As a QA engineer exploring the Testver Playground
  I want to verify the homepage loads correctly
  So that I can confirm the application is accessible and all key elements are present

  Scenario: Verify homepage loads with all key elements
    Given I navigate to the Testver Playground homepage
    Then the page title should contain "Home · TestverQA"
    And the main heading should be "A complete playground for test automation"
    And the search input should be displayed with placeholder "Search modules…  (Ctrl + K)"
    And the brand link "Testver Playground" should be visible
    And the "Sign in" link should be visible
    And the theme toggle button should be visible
    And the reset state button should be visible
    And the following modules should be displayed:
      | Authentication          |
      | Form Elements           |
      | Buttons & Interactions  |
      | Tables & Grids          |
      | Tabs & Accordions       |
      | Loaders & Waits         |
      | AJAX & API              |
      | Real-time / WS          |
      | File Upload / Download   |
      | Modals, Alerts, Toasts  |
      | iFrames & Windows       |
      | Drag & Drop             |
      | Shadow DOM              |
      | Canvas & SVG            |
      | E-commerce Flow         |
      | Admin Dashboard         |
      | Locator Challenges      |
      | Edge Cases              |
      | i18n & RTL              |
      | Accessibility           |
      | API Docs                |
      | State Inspector         |
