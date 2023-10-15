Feature: FaceBook Login feature
  
  Scenario: User login FacebookHome Page 
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the faceboook homepage
