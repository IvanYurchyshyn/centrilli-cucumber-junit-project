@B29G29-254
Feature: Calendar page daily, weekly and monthly

  Background: User logs in and clicks Calendar
    Given user is already logged in as "pos" manager
    Then user clicks Calendar on module

  @B29G29-242
  Scenario: User sees the calendar as a Daily
    When user clicks Day button
    And user sees Day button is selected
    Then user sees current day

  @B29G29-247
  Scenario: User sees the calendar as a Weekly (as a default)
    Given user sees Week button is selected
    Then user sees current week


  @B29G29-248
  Scenario: User sees the calendar as a Monthly
    When user clicks Month button
    And user sees Month button is selected
    Then user sees current month



