@US16
Feature: Accessing Modules as an Expenses Manager

  Background: User is on home page
    Given user is already logged in as "Expenses" manager

  Scenario: Expenses manager can access different modules
    Given user clicks Discuss on the module
    Then user see #inbox on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Calendar on the module
    Then user see Meetings on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Notes on the module
    Then user see Notes on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Contacts on the module
    Then user see Contacts on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Website on the module
    Then user see Login on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Events on the module
    Then user see Events on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Employees on the module
    Then user see Employees on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Leaves on the module
    Then user see Leaves Summary on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Expenses on the module
    Then user see Expenses to Submit on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Lunch on the module
    Then user see New Order Teams on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Maintenance on the module
    Then user see Maintenance Teams on the title

  Scenario: Expenses manager can access different modules
    Given user clicks Dashboard on the module
    Then user see My Dashboard on the title