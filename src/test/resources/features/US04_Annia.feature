@B29G29-275
Feature: Event Creation
  US04- As a POS_manager,
  I should be able to create events on my calendar from "Calendar" module

  Background:
  Given user is already logged in as "POS" manager


  @B29G29-273
  Scenario: User can create an event by clicking on a time box
    Given the calendar is open
    When I click on a time box
    Then I enter the event details
    And click on the "Create" button


  @B29G29-274
  Scenario: User can see event details when clicking the event on the calendar
    Given the calendar is open
    When there is an existing event on the calendar
    Then the event details should be displayed


    # given: pre-condition
    # when: action
    # then: verification/ assertion
    #and
    #but













