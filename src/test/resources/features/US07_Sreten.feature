Feature: Get the right info on the sales page


  Scenario: user should see expected columns on sales page
    Given user is already logged in as "sales" manager
    When user click Sales on module
    Then user should see the Quotation Number row
    Then user should see the Quotation Date row
    Then user should see the Customer row
    Then user should see the Salesperson row
    Then user should see the Total row
    Then user should see the Status row

  Scenario: user should see the result when entering Quotation Number Data
    Given user is already logged in as "sales" manager
    When user enters Quotation Number Data
    Then user should see the result on the list
#BUG BUG BUG
