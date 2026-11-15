Feature: Real-time / WebSocket Module

  As a QA engineer testing the Testver Playground
  I want to verify real-time features work correctly
  So that I can ensure live counter, stock ticker, and live chat function properly

  @realtime @smoke
  Scenario: Realtime page loads with all real-time features
    Given I navigate to the realtime page
    Then the live counter section should be visible
    And the live stock ticker should be visible
    And the live chat section should be visible

  @realtime
  Scenario: Live counter increments and decrements
    Given I navigate to the realtime page
    When I click the increment button
    Then the counter value should increase
    When I click the decrement button
    Then the counter value should decrease
    When I click the reset button
    Then the counter should reset to zero

  @realtime
  Scenario: Send a chat message
    Given I navigate to the realtime page
    When I set the chat user name to "Tester"
    And I type a chat message "Hello from automation!"
    And I click the send button
    Then the chat message should appear in the chat feed
