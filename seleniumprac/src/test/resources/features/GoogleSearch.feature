Feature: Check the Google Search Functionality
  I want to use this template for my feature file

  Scenario Outline: Validate the google search functionality
    Given user is on the browser page
    When user enters "<searchtext>"
    Then user should be navigated to search results

    Examples: 
      | searchtext |
      | selenium   |
      | Java       |
