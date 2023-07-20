@B29G29-240
Feature: As a Sales Manager, I should be able to create a new customer from "Sales" module

	Background:
		#@B29G29-237
		Given user is already logged in as sales manager

	@B29G29-238
	Scenario: Verify user can create a new customer
		When user clicks Sales Button at menu
		And user clicks Customers Button at sub-menu
		And user clicks Create Button
		And user fills the Name Input Box
		And user clicks Save Button
		Then user sees the information of customer which is created


	@B29G29-239
	Scenario: Verify sales Manager can edit customer information
		Given user is on Customers page
		When user clicks any customer
		When user clicks Edit Button
		And user selects Individual or Company radio button
		And user edits Company
		And user edits Street Input Boxes
		And user edits City
		And user edits State
		And user edits Country
		And user edits TIN
		And User edits Tags
		And user edits Job Position
		And user edits Phone
		And user edits Mobile
		And user edits Email
		And user edits Website
		And user edits Title
		And user edits Language
		And user clicks Save
		Then all the boxes should be edited
