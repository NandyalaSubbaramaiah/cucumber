Feature: Gmail login feature
@smoke
  Scenario Outline: FB Login feature
    Given user open the browser
    And user is in FB login page
    When user enter "<username>" and "<password>"
    Then user is navigate to FBHome Page Successfully

    Examples: 
      | username   | password     |
      | 9704661656 | Subbu165689$ |
