Feature: login functionality features

  Background:
    Given user opens the browser and navigate to facebook.com
    When user see the facebook logo is displayed

  Scenario Outline: user not being able to login using invalid credentials
    Then user provides <username> and <password> in the desired field
    And user clicks on the login button
    And user can see error message
    Then user closes the browser

    Examples:
    | username         | password |
    |testuser@gmail.com| 1234abc  |
    |testuser@gmail.com| 1234abc  |

  Scenario: user being able to click on login button from the footer of the landing page
    Then user clicks on the login button from the footer
    And user can see the login page is displayed
    Then user closes the browser

  #Scenario: user being able to click on signup button from the footer of the landing page
    #Given user opens the browser and navigate to facebook.com
    #When user see the facebook logo is displayed
    #Then user clicks on the signup button from the footer
    #And user can see the signup page is displayed

  #Gherkin keywords: given, when, then, and, but