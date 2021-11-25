@GoogleSearch
Feature: Feature to test Google Search Functionality

  Scenario: Test Google Search functionality with visible search button
    Given the Chrome browser is open
    And user is on the Google search page
    When user enters a text "Selenium HQ" in the Search Box
    And user clicks on the visible Google Search button
    Then user is taken to the search results page
    And page title shows the search text as "Selenium HQ - Google Search"
    And browser is closed

  Scenario: Test Google Search functionality with enter key
    Given the Chrome browser is open
    And user is on the Google search page
    When user enters a text "Selenium HQ" in the Search Box
    And user presses the Enter key
    Then user is taken to the search results page
     And page title shows the search text as "Selenium HQ - Google Search"
    And browser is closed
    