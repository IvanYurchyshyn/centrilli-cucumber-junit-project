@B29G29-253
Feature: Default

	
	@B29G29-250
	Scenario: 1. Verify there are 6 columns to see the quotations on the Sales page when the POS managers login.
		Given user is already logged in as "POS" manager
		    When user click Sales on module
		    Then user should see the Quotation Number row
		    Then user should see the Quotation Date row
		    Then user should see the Customer row
		    Then user should see the Salesperson row
		    Then user should see the Total row
		    Then user should see the Status row	

	
	@B29G29-251
	Scenario: 2. Verify sales manager can see the result on the list when searching with Quotation Number data.
		Given user is already logged in as "sales" manager
		    When user enters Quotation Number Data
		    Then user should see the result on the list

	
	@B29G29-249
	Scenario: 1. Verify there are 6 columns to see the quotations on the Sales page when the sales managers login.
		Given user is already logged in as "sales" manager
		    When user click Sales on module
		    Then user should see the Quotation Number row
		    Then user should see the Quotation Date row
		    Then user should see the Customer row
		    Then user should see the Salesperson row
		    Then user should see the Total row
		    Then user should see the Status row	

	
	@B29G29-252
	Scenario: 2. Verify POS manager can see the result on the list when searching with Quotation Number data.
		Given user is already logged in as "POS" manager
		    When user enters Quotation Number Data
		    Then user should see the result on the list