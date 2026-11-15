Feature: File Operations Module

  As a QA engineer testing the Testver Playground
  I want to verify file operations work correctly
  So that I can ensure single upload, multi-upload, drag & drop, and downloads function properly

  @files @smoke
  Scenario: Files page loads with all file operation types
    Given I navigate to the files page
    Then the single file upload section should be visible
    And the multi-file upload section should be visible
    And the drag and drop zone should be visible
    And the downloads section should be visible
