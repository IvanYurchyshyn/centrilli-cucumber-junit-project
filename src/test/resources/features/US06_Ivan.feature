@B29G29-235
Feature: Add new product as POS Manager

  Agile story: As a PosManager, I should be able to add new products to inventory.

  Background:
    Given user is already logged in as "POS" manager
@B29G29-233
  Scenario: The POS manager can create a new product by filling only the Product Name
    When user press Inventory module
    And user clicks on Products module
    And user clicks on Create button
    And user types product name as "Macintosh"
    And user clicks on Save button
    And user clicks on Products module
    And user types product name as "Macintosh" in search box and press Enter
    Then user should see "Macintosh" product was created
@B29G29-234
  Scenario: The POS manager clicks any product and then clicking the edit button all the boxes entered information can be editable again
    When user press Inventory module
    And user clicks on Products module
    And user clicks on any product
    And user clicks on Edit button
    And user types product name as "Macintosh"
    And user clicks Can be Sold checkbox
    And user clicks Can be Purchased checkbox
    And user clicks Can be Expensed checkbox
    And user chooses from Product Type dropdown Service option
    And user chooses from Category dropdown "All" option
    And user types in Internal Reference field "Mac"
    And user types in Barcode field "12345"
    And user types in Sales Price field "1.00"
    And user types in Cost field "1.00"
    Then user should be able to do all changes

