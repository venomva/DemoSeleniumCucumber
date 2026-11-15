Feature: AJAX & API Module

  As a QA engineer testing the Testver Playground
  I want to verify AJAX and API interactions work correctly
  So that I can ensure HTTP methods, slow APIs, error handling, race conditions, and SSE function properly

  @ajax @smoke
  Scenario: AJAX page loads with all API interaction types
    Given I navigate to the AJAX page
    Then the HTTP methods section should be visible
    And the slow API section should be visible
    And the forced errors section should be visible
    And the race condition section should be visible
    And the SSE feed section should be visible

  @ajax
  Scenario: GET request returns data
    Given I navigate to the AJAX page
    When I click the GET button
    Then the GET request should complete successfully

  @ajax
  Scenario: POST request creates data
    Given I navigate to the AJAX page
    When I click the POST button
    Then the POST request should complete successfully

  @ajax
  Scenario: PUT request updates data
    Given I navigate to the AJAX page
    When I click the PUT button
    Then the PUT request should complete successfully

  @ajax
  Scenario: DELETE request removes data
    Given I navigate to the AJAX page
    When I click the DELETE button
    Then the DELETE request should complete successfully

  @ajax
  Scenario: Slow API request completes after delay
    Given I navigate to the AJAX page
    When I click the slow API button
    Then the slow request should complete after 4 seconds

  @ajax
  Scenario: Error status codes are handled
    Given I navigate to the AJAX page
    When I trigger a 400 error
    Then the error should be displayed
    When I trigger a 401 error
    Then the error should be displayed
    When I trigger a 404 error
    Then the error should be displayed
    When I trigger a 500 error
    Then the error should be displayed
    When I trigger a 503 error
    Then the error should be displayed

  @ajax
  Scenario: Race condition with 5 parallel calls
    Given I navigate to the AJAX page
    When I fire 5 parallel requests
    Then all 5 requests should complete

  @ajax
  Scenario: SSE stream starts and stops
    Given I navigate to the AJAX page
    When I start the SSE stream
    Then the stream should receive events
    When I stop the SSE stream
    Then the stream should stop
