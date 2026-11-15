Feature: E-commerce Flow Module

  As a QA engineer testing the Testver Playground
  I want to verify the e-commerce flow works correctly
  So that I can ensure product listing, filtering, sorting, and add to cart function properly

  @shop @smoke
  Scenario: Shop page loads with all e-commerce features
    Given I navigate to the shop page
    Then the product search input should be visible
    And the price filter inputs should be visible
    And the category dropdown should be visible
    And the sort dropdown should be visible
    And the add to cart buttons should be visible

  @shop
  Scenario: Filter products by search
    Given I navigate to the shop page
    When I search for a product "Laptop"
    And I click the apply filters button
    Then matching products should be displayed

  @shop
  Scenario: Add product to cart
    Given I navigate to the shop page
    When I click the add to cart button for the first product
    Then the product should be added to the cart
