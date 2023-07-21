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
		And user fills the Name Input Box as "John"
		And user clicks Save Button
		Then user sees the information of customer which is created

	@B29G29-239
	Scenario: Verify sales Manager can edit customer information
		Given user is on Customers page
		When user clicks any customer
		When user clicks Edit Button
		And user selects Individual radio button
		And user selects Company radio button
		And user edits Name as "3"
		And user edits Street Input Boxes as "Oe Street",
		And user edits Streetb Input Boxes as "1212",
		And user edits City as "London"
		And user edits Zip as "N1P 3AG"
		And user edits TIN as "2544523"
		And user edits Job Position as "Consultant"
		And user edits Phone as "440903022"
		And user edits Mobile as "255542321"
		And user edits Email as "jnf@gmail.com"
		And user edits Website as "aa.io.com"
		And user edits Company as "ASfdADSF"
		Then user clicks Save
