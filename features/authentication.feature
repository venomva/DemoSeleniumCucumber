Feature: Authentication Module

  As a QA engineer testing the Testver Playground
  I want to verify the authentication flows
  So that I can ensure login, signup, and forgot password work correctly

  @auth @smoke
  Scenario: Login page loads with all key elements
    Given I navigate to the login page
    Then the login heading should contain "Welcome back"
    And the username input should be visible
    And the password input should be visible
    And the remember me checkbox should be visible
    And the sign in button should be visible
    And the forgot password link should be visible
    And the create account link should be visible

  @auth
  Scenario: Login with valid credentials
    Given I navigate to the login page
    When I enter username "admin"
    And I enter password "admin123"
    And I click the sign in button
    Then I should be logged in successfully

  @auth
  Scenario: Signup page loads with all key elements
    Given I navigate to the signup page
    Then the signup heading should contain "Create account"
    And the full name input should be visible on signup
    And the signup username input should be visible
    And the email input should be visible on signup
    And the signup password input should be visible
    And the confirm password input should be visible
    And the agree terms checkbox should be visible on signup
    And the create account button should be visible on signup

  @auth
  Scenario: Forgot password page loads correctly
    Given I navigate to the forgot password page
    Then the forgot password heading should contain "Reset your password"
    And the forgot email input should be visible
    And the send reset link button should be visible
    And the back to login link should be visible

  @auth
  Scenario: Navigate from login to signup and back
    Given I navigate to the login page
    When I click the create account link
    Then I should be on the signup page
    When I click the sign in link from signup
    Then I should be on the login page
