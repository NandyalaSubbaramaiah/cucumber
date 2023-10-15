Feature: FaceBook Login
  
  Scenario: User is login FaceBookHomePage functionalities.
    Given user open the browser
    And user is on FB login page
    When user enter username and password
    When user clicks on FB login button
    Then user is navigate the FBHome Page
 
  Scenario: User is login FBPage with valid username and valid password
    Given user open the browser
    And user is on FB login page
    When user enter valid username and valid password
    When user clicks on FB login button
    Then user is navigate the FBHome Page
 
  Scenario: User is login FBPage with valid username and invalid password
    Given user open the browser
    And user is on FB login page
    When user enter valid username and invalid password
    When user clicks on FB login button
    Then user is not navigate the FaceBookHome Page
 
  Scenario: User is login FBPage with invalid username and valid password
    Given user open the browser
    And user is on FB login page
    When user enter invalid username and valid password
    When user clicks on FB login button
    Then user is not navigate the FaceBookHome Page
 
  Scenario: User is login FBPage with invalid username and invalid password
    Given user open the browser
    And user is on FB login page
    When user enter invalid username and invalid password
    When user clicks on FB login button
    Then user is not navigate the FaceBookHome Page
