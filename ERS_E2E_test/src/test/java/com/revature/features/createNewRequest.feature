Feature: Create new request

Scenario: Creating a new request successfully (positive test)
	Given I am at the welcome page
	When I I click the create new request button
	And I enter in a valid amount in the amount field
	And I enter in a valid description in the description field
	And I select a valid type
	And I attach a valid receipt
	And I click the submit button
	Then I should see a message saying request successfully submitted and the new request displayed in the requests tab
	
Scenario: Creating a new request amount equal to or less than zero (negative test)
	Given I am at the welcome page
	When I I click the create new request button
	When I enter in an amount equal to or less than zero
	And I enter in a valid description in the description field
	And I select a valid type
	And I attach a valid receipt
	And I click the submit button
	Then I should see a message saying request amount can not be equal to or less than zero 

Scenario: Creating a new request type not selected (negative test)
	Given I am at the welcome page
	When I I click the create new request button
	And I enter in a valid amount in the amount field
	And I enter in a valid description in the description field
	And I attach a valid receipt
	And I click the submit button
	Then I should see a message saying please select a valid type for request

Scenario: Creating a new request no receipt attached (negative test)
	Given I am at the welcome page
	When I I click the create new request button
	And I enter in a valid amount in the amount field
	And I enter in a valid description in the description field
	And I select a valid type
	And I click the submit button
	Then I should see a message saying please attach a valid receipt

Scenario: Creating a new request no description provided (negative test)
	Given I am at the welcome page
	When I I click the create new request button
	And I enter in a valid amount in the amount field
	And I select a valid type
	And I attach a valid receipt
	And I click the submit button
	Then I should see a message saying please provide a description for request


	