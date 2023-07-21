@US13
Feature: Verify the POS managers has access to 22 modules

  Background: User is on home page
    Given user is already logged in as "POS" manager


  Scenario: Verify access to Discuss module
    Given  POS manager click the Discuss module
    Then user sees the title is changing to Inbox



  Scenario: Verify access to Calendar module
    Given POS manager click the Calendar module
    Then user sees the title is changing to Meetings




  Scenario: Verify access to Notes module
    Given POS manager click the Notes module
    Then user sees the title is changing to Notes



  Scenario: Verify access to Contacts module
    Given POS manager click the Contacts module
    Then user sees the title is changing to Contacts



  Scenario: Verify access to CRM module
    Given POS manager click the CRM module
    Then user sees the title is changing to Pipeline



  Scenario: Verify access to Sales module
    Given POS manager click the Sales module
    Then user sees the title is changing to Quotations



  Scenario: Verify access to Website module
    Given POS manager click the Website module
    Then user sees the title is changing to Dashboard

  Scenario: Verify access to Point of Sale module
    Given POS manager click the Point of Sale module
    Then user sees the title is changing to Point of Sale

  Scenario: Verify access to Purchases module
    Given POS click the Purchases module
    Then user sees the title is changing to Request for Quotation



  Scenario: Verify access to Inventory module
    Given POS manager click the Inventory module
    Then user sees the title is changing to Inventory

  Scenario: Verify access to Manufacturing module
    Given POS manager click the Manufacturing module
    Then user sees the title is changing to Manufacturing Orders


  Scenario: Verify access to Repairs module
    Given POS manager click the Repairs module
    Then user sees the title is changing to Repair Orders

  Scenario: Verify access to Project module
    Given POS manager click the Project module
    Then user sees the title is changing to Project

  Scenario: Verify access to Events module
    Given POS manager click the Events module
    Then user sees the title is changing to Events

  Scenario: Verify access to Surveys module
    Given POS manager click the Surveys module
    Then user sees the title is changing to Surveys

  Scenario: Verify access to Employees module
    Given POS manager click the Employees module
    Then user sees the title is changing to Employees

  Scenario: Verify access to Attendances module
    Given POS manager click the Attendances module
    Then user sees the title is changing to Attendance

  Scenario: Verify access to Leaves module
    Given POS manager click the Leaves module
    Then user sees the title is changing to All Leaves


  Scenario: Verify access to Expenses module
    Given POS manager click the Expenses module
    Then user sees the title is changing to My Expenses to Submit



  Scenario: Verify access to Maintenance module
    Given POS manager click the Maintenance module
    Then user sees the title is changing to Maintenance Teams




  Scenario: Verify access to Fleet module
    Given POS manager click the Fleet module
    Then user sees the title is changing to Vehicles




  Scenario: Verify access to Dashboard module
    Given POS manager click the Dashboard module
    Then user sees the title is changing to My Dashboard
