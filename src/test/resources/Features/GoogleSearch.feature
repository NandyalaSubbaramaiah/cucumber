Feature: GoogleSearch Page

 //@smoketest
  Scenario: Search the text on the GoogleSearchPage
    Given user lunch the browser
    When user open used google search page URL
    When user search some text on the google searchbox
    And user hits search box
    Then user navigate the search results
