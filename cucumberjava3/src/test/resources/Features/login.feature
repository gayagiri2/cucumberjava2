#Author
#Date
#Description

Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks the login button
    Then user is navigated to home page

 #Feature: feature to test login1 functionality
#
 # Scenario: Check login is successful with valid credentials
  #  Given user is on login page
   # When user enters username and password
    #And clicks the login button
    #hen user is navigated to home page