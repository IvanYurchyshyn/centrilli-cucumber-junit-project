@B29G29-193
Feature: Calendar page daily, weekly and monthly.

  Background: User logs in and clicks Calendar
    Given user is already logged in as "pos" manager
    Then user clicks Calendar on module

  @B29G29-242
  Scenario: User sees the calendar as a daily
    Given user clicks Day button
    Then user sees current day


