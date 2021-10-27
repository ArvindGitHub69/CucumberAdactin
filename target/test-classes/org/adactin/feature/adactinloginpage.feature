Feature: Automate adactin Hotel page

  Scenario: Check the login page with valid user name and password
    Given Launch the Browser
    When User gives the valid User name and Password
    Then User should get logged in and navigate to another page.
    Given User will wait for the page to load from the login page
    When user will select hotel location
    Then user will select which hotel to stay
    And user will select the type of room
    And user will select the number of rooms
    And user will select the check in date
    And user will select the check out date
    And user will select the Adult per room
    And user will select if Child present per room
    And user will select Search to  see the list of hotels in the next page
