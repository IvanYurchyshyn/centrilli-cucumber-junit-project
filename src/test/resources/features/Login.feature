Feature: Log in to application

  Background: user is already on log in page
    Given user is on log in page

  Scenario: user should be able to log in
      When user log in with "posmanager"
